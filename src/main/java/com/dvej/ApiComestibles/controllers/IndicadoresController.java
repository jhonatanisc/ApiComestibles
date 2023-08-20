package com.dvej.ApiComestibles.controllers;

import com.dvej.ApiComestibles.models.Pacientes.Indicadores;
import com.dvej.ApiComestibles.services.Indicadores.IndicadoresImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api/paciente/indicadores")
public class IndicadoresController {
    @Autowired
    IndicadoresImplement service;
    @GetMapping("/saludo")
    public String saludar(){
        return "Vas bien campeón";
    }
    @GetMapping("/all")
    public ArrayList<Indicadores> getAllIndicadores(){
        return service.getAll();
    }
    @GetMapping("/find/{id}")
    public Optional<Indicadores> getIndicadoresById(@PathVariable("id") long id){
        return service.getById(id);
    }
    @PostMapping("/save")
    public Indicadores saveIndicadores(@RequestBody Indicadores indicadores){
        return service.save(indicadores);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteIndicadoresById(@PathVariable("id") long id){
        return service.deleteById(id) ? "Se elimino el alimento" : "No se pudo eliminar el alimento";
    }
}
