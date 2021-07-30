package com.alura.microservice.fornecedor.repository;

import com.alura.microservice.fornecedor.model.InfoProvider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends CrudRepository<InfoProvider, Long> {
    InfoProvider findByState(String state);
}
