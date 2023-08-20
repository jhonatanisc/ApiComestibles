package com.dvej.ApiComestibles.services.Particularidades;

import com.dvej.ApiComestibles.models.Pacientes.Particularidades;

import java.util.ArrayList;
import java.util.Optional;

public interface ParticularidadesService {
    ArrayList<Particularidades> getAll();
    Optional<Particularidades> getById(long id);
    Particularidades save(Particularidades particularidades);
    boolean deleteById(long id);
}
