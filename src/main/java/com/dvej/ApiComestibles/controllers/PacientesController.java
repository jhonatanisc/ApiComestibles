package com.dvej.ApiComestibles.controllers;

import com.dvej.ApiComestibles.models.Pacientes.Paciente;
import com.dvej.ApiComestibles.services.Pacientes.PacienteImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api/pacientes")
public class PacientesController {
    @Autowired
    PacienteImplement service;
    @GetMapping("/saludo")
    public String saludar(){
        return "Vas bien campeón";
    }
    @GetMapping("/all")
    public ArrayList<Paciente> getAll(){
        return service.getAll();
    }
    @GetMapping("/find/{id}")
    public Optional<Paciente> getById(@PathVariable("id") long id){
        return service.getById(id);
    }

    @PostMapping("/save")
    public Paciente save(@RequestBody Paciente pacientes){
        return service.save(pacientes);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") long id){
        return service.deleteById(id) ? "Se elimino el paciente" : "No se pudo eliminar el paciente";
    }
}
