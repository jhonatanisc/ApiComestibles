package com.dvej.ApiComestibles.services.GruposAlimenticios;

import com.dvej.ApiComestibles.models.Alimentos.GrupoAlimenticio;

import java.util.ArrayList;
import java.util.Optional;

public interface GrupoAlimenticioService {
    ArrayList<GrupoAlimenticio> getAll();
    Optional<GrupoAlimenticio> getById(long id);
    GrupoAlimenticio save(GrupoAlimenticio alimento);
    boolean deleteById(long id);
    ArrayList<GrupoAlimenticio> saveAll(ArrayList<GrupoAlimenticio> grupos);
}