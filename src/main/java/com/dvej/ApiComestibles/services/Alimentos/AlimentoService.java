package com.dvej.ApiComestibles.services.Alimentos;


import com.dvej.ApiComestibles.models.Alimentos.Alimento;

import java.util.ArrayList;
import java.util.Optional;

public interface AlimentoService {
    ArrayList<Alimento> getAll();
    Optional<Alimento> getById(long id);
    Alimento save(Alimento alimento);
    boolean deleteById(long id);
}
