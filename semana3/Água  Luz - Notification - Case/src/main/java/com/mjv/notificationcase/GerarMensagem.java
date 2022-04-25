package com.mjv.notificationcase;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GerarMensagem {
	public void mensagem(Cadastro cadastro, Contrato contrato) {

		
		String valorFormatado = NumberFormat.getCurrencyInstance().format(contrato.getValor());

		String formatDataHora = LocalDateTime.of(2022, 02, 21, 16, 00).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		String.format("%014d", Long.valueOf(cadastro.getCpf().replaceAll("\\D", "")));

		System.out.println("Senhor(a) " + cadastro.getNome() + " cpf de número " + cadastro.getCpf()
				+ ", Informamos que conforme contrato com protocolo de número " + contrato.NumeroDoProtocolo()
				+ " está agendado para a data " + (formatDataHora) + " a instalação do serviço de " + contrato.getTiposervico() +" com taxa de valor "
				+ (valorFormatado) + " em sua residência localizada no endereço abaixo:" + "\nLogradouro: " + cadastro.getLogradouro() + "\nComplemento: "
				+ cadastro.getComplemento() + "\nBairro: " + cadastro.getBairro() + "\nCidade: " + cadastro.getCidade() + "\nCep: " + cadastro.getCep());
	}
}
