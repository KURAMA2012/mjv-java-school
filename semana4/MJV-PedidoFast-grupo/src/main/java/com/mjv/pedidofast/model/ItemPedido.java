package com.mjv.pedidofast.model;


import lombok.Data;

@Data
public class ItemPedido {

    private Produto produto;
    private Integer quantidade;
}
