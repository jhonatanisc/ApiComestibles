package com.dvej.ApiComestibles.controllers;

import com.dvej.ApiComestibles.models.Pacientes.Porcentajes;
import com.dvej.ApiComestibles.services.Porcentajes.PorcentajesImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api/paciente/porcentajes")
public class PorcentajesController {
    @Autowired
    PorcentajesImplement service;
    @GetMapping("/saludo")
    public String saludar(){
        return "Vas bien campeón";
    }
    @GetMapping("/all")
    public ArrayList<Porcentajes> getAllPorcentajes(){
        return service.getAll();
    }
    @GetMapping("/find/{id}")
    public Optional<Porcentajes> getPorcentajesById(@PathVariable("id") long id){
        return service.getById(id);
    }
    @PostMapping("/save")
    public Porcentajes savePorcentajes(@RequestBody Porcentajes porcentajes){
        return service.save(porcentajes);
    }
    @DeleteMapping("/delete/{id}")
    public String deletePorcentajesById(@PathVariable("id") long id){
        return service.deleteById(id) ? "Se eliminó el porcentaje" : "No se pudo eliminar el porcentaje";
    }
}