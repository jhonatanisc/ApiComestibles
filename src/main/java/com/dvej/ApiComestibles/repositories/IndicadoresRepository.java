package com.dvej.ApiComestibles.repositories;

import com.dvej.ApiComestibles.models.Pacientes.Indicadores;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndicadoresRepository extends CrudRepository<Indicadores, Long> {
}
