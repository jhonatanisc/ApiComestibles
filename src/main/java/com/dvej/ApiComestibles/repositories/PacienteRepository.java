package com.dvej.ApiComestibles.repositories;

import com.dvej.ApiComestibles.models.Pacientes.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Long> {
}
