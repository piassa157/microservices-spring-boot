package com.alura.loja.microservice.controller;

import com.alura.loja.microservice.controller.dto.BuyDTO;
import com.alura.loja.microservice.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/buy")
public class BuyController {

    @Autowired
    private BuyService buyService;

    @PostMapping
    public void bought(@RequestBody BuyDTO buyDTO){
        buyService.boughtThis(buyDTO);
    }
}
