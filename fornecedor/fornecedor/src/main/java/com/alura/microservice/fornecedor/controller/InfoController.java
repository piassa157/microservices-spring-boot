package com.alura.microservice.fornecedor.controller;

import com.alura.microservice.fornecedor.model.InfoProvider;
import com.alura.microservice.fornecedor.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping("{state}")
    public InfoProvider getInfoState(@PathVariable String state){
        return infoService.getInfoByState(state);
    }
}
