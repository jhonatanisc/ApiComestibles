package com.dvej.ApiComestibles.services.Unidades;

import com.dvej.ApiComestibles.models.Alimentos.Unidad;

import java.util.ArrayList;
import java.util.Optional;

public interface UnidadService {
    ArrayList<Unidad> getAll();
    Optional<Unidad> getById(long id);
    Unidad save(Unidad unidad);
    boolean deleteById(long id);
    ArrayList<Unidad> saveAll(ArrayList<Unidad> unidades);
}
