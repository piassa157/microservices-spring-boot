package com.alura.loja.microservice.controller.dto;

import java.util.List;

public class BuyDTO {

    private List<ItemByBuyDTO> itens;

    public List<ItemByBuyDTO> getItens() {
        return itens;
    }

    public void setItens(List<ItemByBuyDTO> itens) {
        this.itens = itens;
    }

    public AdressDTO getAdress() {
        return adress;
    }

    public void setAdress(AdressDTO adress) {
        this.adress = adress;
    }

    private AdressDTO adress;

}
