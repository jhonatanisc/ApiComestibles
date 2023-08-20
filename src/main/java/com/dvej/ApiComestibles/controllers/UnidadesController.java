package com.dvej.ApiComestibles.controllers;

import com.dvej.ApiComestibles.models.Alimentos.Unidad;
import com.dvej.ApiComestibles.services.Unidades.UnidadImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api/unidades")
public class UnidadesController {
    @Autowired
    UnidadImplement service;
    @GetMapping("/saludo")
    public String saludar(){
        return "Vas bien campeón";
    }
    @GetMapping("/all")
    public ArrayList<Unidad> getAllUnidad(){
        return service.getAll();
    }
    @GetMapping("/find/{id}")
    public Optional<Unidad> getUnidadById(@PathVariable("id") long id){
        return service.getById(id);
    }

    @PostMapping("/save")
    public Unidad saveUnidad(@RequestBody Unidad unidad){
        return service.save(unidad);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUnidadById(@PathVariable("id") long id){
        return service.deleteById(id) ? "Se elimino la unidad" : "No se pudo eliminar la unidad";
    }

    @PostMapping("/save_all")
    public ArrayList<Unidad> saveAll(@RequestBody ArrayList<Unidad> unidades){
        return service.saveAll(unidades);
    }

}
