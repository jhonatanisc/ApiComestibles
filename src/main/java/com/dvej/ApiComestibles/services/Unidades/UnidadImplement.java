package com.dvej.ApiComestibles.services.Unidades;

import com.dvej.ApiComestibles.models.Alimentos.Unidad;
import com.dvej.ApiComestibles.repositories.UnidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class UnidadImplement implements UnidadService{

    @Autowired
    UnidadRepository unidadRepository;
    @Override
    public ArrayList<Unidad> getAll() {
        return (ArrayList<Unidad>) unidadRepository.findAll();
    }

    @Override
    public Optional<Unidad> getById(long id) {
        return unidadRepository.findById(id);
    }

    @Override
    public Unidad save(Unidad unidad) {
        return unidadRepository.save(unidad);
    }

    @Override
    public boolean deleteById(long id) {
        try{
            Optional<Unidad> a = getById(id);
            unidadRepository.delete(a.get());
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }finally {

        }
    }
    @Override
    public ArrayList<Unidad> saveAll(ArrayList<Unidad> unidades) {
        ArrayList<Unidad> unidadesGuardadas = new ArrayList<>();
        for (Unidad unidad : unidades) {
            unidadesGuardadas.add(unidadRepository.save(unidad));
        }
        return unidadesGuardadas;
    }
}
