package com.alura.microservice.fornecedor.service;


import com.alura.microservice.fornecedor.model.InfoProvider;
import com.alura.microservice.fornecedor.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;

    public InfoProvider getInfoByState(String state) {
        return infoRepository.findByState(state);
    }
}
