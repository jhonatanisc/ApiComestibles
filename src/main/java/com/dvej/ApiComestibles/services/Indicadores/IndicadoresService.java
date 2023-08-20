package com.dvej.ApiComestibles.services.Indicadores;


import com.dvej.ApiComestibles.models.Pacientes.Indicadores;

import java.util.ArrayList;
import java.util.Optional;

public interface IndicadoresService {
    ArrayList<Indicadores> getAll();
    Optional<Indicadores> getById(long id);
    Indicadores save(Indicadores alimento);
    boolean deleteById(long id);
}
