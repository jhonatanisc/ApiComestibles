package com.dvej.ApiComestibles.services.Porcentajes;

import com.dvej.ApiComestibles.models.Pacientes.Porcentajes;

import java.util.ArrayList;
import java.util.Optional;

public interface PorcentajesService {
    ArrayList<Porcentajes> getAll();
    Optional<Porcentajes> getById(long id);
    Porcentajes save(Porcentajes porcentajes);
    boolean deleteById(long id);
}