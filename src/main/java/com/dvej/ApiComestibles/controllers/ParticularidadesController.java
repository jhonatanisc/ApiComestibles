package com.dvej.ApiComestibles.controllers;

import com.dvej.ApiComestibles.models.Pacientes.Particularidades;
import com.dvej.ApiComestibles.services.Particularidades.ParticularidadesImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api/paciente/particularidades")
public class ParticularidadesController {
    @Autowired
    ParticularidadesImplement service;
    @GetMapping("/saludo")
    public String saludar(){
        return "Vas bien campeón";
    }
    @GetMapping("/all")
    public ArrayList<Particularidades> getAllParticularidades(){
        return service.getAll();
    }
    @GetMapping("/find/{id}")
    public Optional<Particularidades> getParticularidadesById(@PathVariable("id") long id){
        return service.getById(id);
    }
    @PostMapping("/save")
    public Particularidades saveParticularidades(@RequestBody Particularidades particularidades){
        return service.save(particularidades);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteParticularidadesById(@PathVariable("id") long id){
        return service.deleteById(id) ? "Se eliminó la particularidad" : "No se pudo eliminar la particularidad";
    }
}
