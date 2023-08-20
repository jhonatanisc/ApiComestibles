package com.dvej.ApiComestibles.repositories;

import com.dvej.ApiComestibles.models.Alimentos.GrupoAlimenticio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoAlimenticioRepository extends CrudRepository<GrupoAlimenticio, Long> {
}
