package com.dvej.ApiComestibles.services.Pacientes;

import com.dvej.ApiComestibles.models.Pacientes.Paciente;

import java.util.ArrayList;
import java.util.Optional;

public interface PacienteService {
    ArrayList<Paciente> getAll();
    Optional<Paciente> getById(long id);
    Paciente save(Paciente paciente);
    boolean deleteById(long id);
}