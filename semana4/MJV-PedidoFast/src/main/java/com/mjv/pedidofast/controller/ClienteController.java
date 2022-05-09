package com.mjv.pedidofast.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/v1/cliente")
public class ClienteController {

    @PostMapping
    public void criaCliente() {


    }
}
