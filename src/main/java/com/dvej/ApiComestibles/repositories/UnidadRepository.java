package com.dvej.ApiComestibles.repositories;

import com.dvej.ApiComestibles.models.Alimentos.Unidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadRepository extends CrudRepository<Unidad, Long> {
}
