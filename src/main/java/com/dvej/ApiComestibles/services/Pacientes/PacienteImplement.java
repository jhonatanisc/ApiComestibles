package com.dvej.ApiComestibles.services.Pacientes;

import com.dvej.ApiComestibles.models.Pacientes.Paciente;
import com.dvej.ApiComestibles.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class PacienteImplement implements PacienteService{
    @Autowired
    PacienteRepository pacienteRepository;
    @Override
    public ArrayList<Paciente> getAll() {
        return (ArrayList<Paciente>) pacienteRepository.findAll();
    }

    @Override
    public Optional<Paciente> getById(long id) {
        return pacienteRepository.findById(id);
    }

    @Override
    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public boolean deleteById(long id) {
        try{
            Optional<Paciente> a = getById(id);
            pacienteRepository.delete(a.get());
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }finally {

        }
    }
}
