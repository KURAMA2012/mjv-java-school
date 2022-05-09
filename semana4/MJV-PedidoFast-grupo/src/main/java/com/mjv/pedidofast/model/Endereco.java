package com.mjv.pedidofast.model;


import lombok.Data;

@Data
public class Endereco {

    private String logradouro;
    private String numero;
    private String bairro;
    private String cep;

}
