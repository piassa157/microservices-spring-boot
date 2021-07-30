package com.alura.loja.microservice.service;

import com.alura.loja.microservice.controller.dto.BuyDTO;
import com.alura.loja.microservice.controller.dto.InforMSCDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BuyService {

    public void boughtThis(BuyDTO buyDTO) {
        RestTemplate client =  new RestTemplate();
        ResponseEntity<InforMSCDTO> exchange =  client.exchange("http://localhost:8081/info/"+buyDTO.getAdress().getState(), HttpMethod.GET, null, InforMSCDTO.class);
        System.out.println(exchange.getBody().getAddress());
    }
}
