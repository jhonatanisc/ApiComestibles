package com.dvej.ApiComestibles.repositories;

import com.dvej.ApiComestibles.models.Pacientes.Porcentajes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PorcentajesRepository extends CrudRepository<Porcentajes, Long> {
}
