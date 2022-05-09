package com.mjv.pedidofast.model;



import lombok.Data;


import java.time.LocalDate;


@Data
public class Cliente {

    private Long id;
    private String nome;
    private String cpf;
    private Endereco endereco;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;

}
