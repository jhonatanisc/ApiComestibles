package com.dvej.ApiComestibles.repositories;

import com.dvej.ApiComestibles.models.Alimentos.Alimento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentoRepository extends CrudRepository<Alimento, Long> {
}
