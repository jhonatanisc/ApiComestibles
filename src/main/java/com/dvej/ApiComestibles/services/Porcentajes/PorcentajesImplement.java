package com.dvej.ApiComestibles.services.Porcentajes;

import com.dvej.ApiComestibles.models.Pacientes.Porcentajes;
import com.dvej.ApiComestibles.repositories.PorcentajesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PorcentajesImplement implements PorcentajesService {
    @Autowired
    PorcentajesRepository porcentajesRepository;

    @Override
    public ArrayList<Porcentajes> getAll() {
        return (ArrayList<Porcentajes>) porcentajesRepository.findAll();
    }

    @Override
    public Optional<Porcentajes> getById(long id) {
        return porcentajesRepository.findById(id);
    }

    @Override
    public Porcentajes save(Porcentajes porcentajes) {
        return porcentajesRepository.save(porcentajes);
    }

    @Override
    public boolean deleteById(long id) {
        try {
            Optional<Porcentajes> p = getById(id);
            porcentajesRepository.delete(p.get());
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}