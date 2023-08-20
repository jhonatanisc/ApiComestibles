package com.dvej.ApiComestibles.services.Alimentos;

import com.dvej.ApiComestibles.models.Alimentos.Alimento;
import com.dvej.ApiComestibles.repositories.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class AlimentoImplement implements AlimentoService{
    @Autowired
    AlimentoRepository alimentoRepository;
    @Override
    public ArrayList<Alimento> getAll() {
        return (ArrayList<Alimento>) alimentoRepository.findAll();
    }

    @Override
    public Optional<Alimento> getById(long id) {
        return alimentoRepository.findById(id);
    }

    @Override
    public Alimento save(Alimento alimento) {
        return alimentoRepository.save(alimento);
    }

    @Override
    public boolean deleteById(long id) {
        try{
            Optional<Alimento> a = getById(id);
            alimentoRepository.delete(a.get());
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }finally {

        }
    }
}
