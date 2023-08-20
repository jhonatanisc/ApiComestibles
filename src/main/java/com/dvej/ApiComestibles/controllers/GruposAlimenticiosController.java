package com.dvej.ApiComestibles.controllers;

import com.dvej.ApiComestibles.models.Alimentos.GrupoAlimenticio;
import com.dvej.ApiComestibles.services.GruposAlimenticios.GrupoAlimenticioImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api/grupos_alimenticios")
public class GruposAlimenticiosController {
    @Autowired
    GrupoAlimenticioImplement service;
    @GetMapping("/saludo")
    public String saludar(){
        return "Vas bien campeón";
    }
    @GetMapping("/all")
    public ArrayList<GrupoAlimenticio> getAll(){
        return service.getAll();
    }
    @GetMapping("/find/{id}")
    public Optional<GrupoAlimenticio> getById(@PathVariable("id") long id){
        return service.getById(id);
    }

    @PostMapping("/save")
    public GrupoAlimenticio save(@RequestBody GrupoAlimenticio grupoAlimenticio){
        return service.save(grupoAlimenticio);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") long id){
        return service.deleteById(id) ? "Se elimino la unidad" : "No se pudo eliminar la unidad";
    }
}
