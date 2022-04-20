package com.mjv.openbanking;

import java.time.LocalDate;

public class GeradorArquivo {

	public static void main(String[] args) {

		Movimentacao movimentacao1 = new Movimentacao();
		movimentacao1.setData(LocalDate.of(2022, 4, 16));
		movimentacao1.setCpfCnpj("135.217.791-18");
		movimentacao1.setNomeCliente("RAIMUNDO NONATO ");// LOUREIRO CASTELO BRANCO
		movimentacao1.setValor(1275.48);
		movimentacao1.setTipo(TipoMovimentacao.RECEITA);
		movimentacao1.setEstornada(false);

		GeradorConteudo gc = new GeradorConteudo();
		String conteudoGerador = gc.gerar(movimentacao1);

		System.out.println(conteudoGerador);

	}

}
