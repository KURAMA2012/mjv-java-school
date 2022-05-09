package com.mjv.pedidofast.model;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class Produto {

    private Long id;
    private BigDecimal valor;
    private String nome;
    private String descricao;

}
