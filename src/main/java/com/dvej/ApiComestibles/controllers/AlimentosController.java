package com.dvej.ApiComestibles.controllers;

import com.dvej.ApiComestibles.models.Alimentos.Alimento;
import com.dvej.ApiComestibles.services.Alimentos.AlimentoImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api/alimentos")
public class AlimentosController {
    @Autowired
    AlimentoImplement service;
    @GetMapping("/saludo")
    public String saludar(){
        return "Vas bien campeón";
    }
    @GetMapping("/all")
    public ArrayList<Alimento> getAllAlimento(){
        return service.getAll();
    }
    @GetMapping("/find/{id}")
    public Optional<Alimento> getAlimentoById(@PathVariable("id") long id){
        return service.getById(id);
    }

    @PostMapping("/save")
    public Alimento saveAlimento(@RequestBody Alimento alimento){
        return service.save(alimento);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteAlimentoById(@PathVariable("id") long id){
        return service.deleteById(id) ? "Se elimino el alimento" : "No se pudo eliminar el alimento";
    }

}
