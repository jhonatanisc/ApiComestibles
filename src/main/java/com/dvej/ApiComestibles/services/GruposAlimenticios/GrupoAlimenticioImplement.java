package com.dvej.ApiComestibles.services.GruposAlimenticios;

import com.dvej.ApiComestibles.models.Alimentos.GrupoAlimenticio;
import com.dvej.ApiComestibles.repositories.GrupoAlimenticioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class GrupoAlimenticioImplement implements GrupoAlimenticioService{
    @Autowired
    GrupoAlimenticioRepository grupoAlimenticioRepository;
    @Override
    public ArrayList<GrupoAlimenticio> getAll() {
        return (ArrayList<GrupoAlimenticio>) grupoAlimenticioRepository.findAll();
    }

    @Override
    public Optional<GrupoAlimenticio> getById(long id) {
        return grupoAlimenticioRepository.findById(id);
    }

    @Override
    public GrupoAlimenticio save(GrupoAlimenticio grupoAlimenticio) {
        return grupoAlimenticioRepository.save(grupoAlimenticio);
    }

    @Override
    public boolean deleteById(long id) {
        try{
            Optional<GrupoAlimenticio> a = getById(id);
            grupoAlimenticioRepository.delete(a.get());
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }finally {

        }
    }

    @Override
    public ArrayList<GrupoAlimenticio> saveAll(ArrayList<GrupoAlimenticio> grupos) {
        ArrayList<GrupoAlimenticio> unidadesGuardadas = new ArrayList<>();
        for (GrupoAlimenticio grupo : grupos) {
            unidadesGuardadas.add(grupoAlimenticioRepository.save(grupo));
        }
        return unidadesGuardadas;
    }
}
