package com.dvej.ApiComestibles.services.Indicadores;

import com.dvej.ApiComestibles.models.Pacientes.Indicadores;
import com.dvej.ApiComestibles.repositories.IndicadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class IndicadoresImplement implements IndicadoresService{
    @Autowired
    IndicadoresRepository indicadoresRepository;
    @Override
    public ArrayList<Indicadores> getAll() {
        return (ArrayList<Indicadores>) indicadoresRepository.findAll();
    }

    @Override
    public Optional<Indicadores> getById(long id) {
        return indicadoresRepository.findById(id);
    }

    @Override
    public Indicadores save(Indicadores indicadores) {
        return indicadoresRepository.save(indicadores);
    }

    @Override
    public boolean deleteById(long id) {
        try{
            Optional<Indicadores> a = getById(id);
            indicadoresRepository.delete(a.get());
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }finally {

        }
    }
}
