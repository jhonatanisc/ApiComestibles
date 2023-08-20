package com.dvej.ApiComestibles.services.Particularidades;

import com.dvej.ApiComestibles.models.Pacientes.Particularidades;
import com.dvej.ApiComestibles.repositories.ParticularidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ParticularidadesImplement implements ParticularidadesService {
    @Autowired
    ParticularidadesRepository particularidadesRepository;

    @Override
    public ArrayList<Particularidades> getAll() {
        return (ArrayList<Particularidades>) particularidadesRepository.findAll();
    }

    @Override
    public Optional<Particularidades> getById(long id) {
        return particularidadesRepository.findById(id);
    }

    @Override
    public Particularidades save(Particularidades particularidades) {
        return particularidadesRepository.save(particularidades);
    }

    @Override
    public boolean deleteById(long id) {
        try {
            Optional<Particularidades> p = getById(id);
            particularidadesRepository.delete(p.get());
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
