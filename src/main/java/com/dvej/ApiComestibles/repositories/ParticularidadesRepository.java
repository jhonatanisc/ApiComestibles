package com.dvej.ApiComestibles.repositories;

import com.dvej.ApiComestibles.models.Pacientes.Particularidades;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticularidadesRepository extends CrudRepository<Particularidades, Long> {
}
