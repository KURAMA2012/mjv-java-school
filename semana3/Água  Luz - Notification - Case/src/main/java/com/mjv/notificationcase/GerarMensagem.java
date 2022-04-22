package com.mjv.notificationcase;

import java.text.NumberFormat;

public class GerarMensagem {
	public String gerar(Cadastro cadastro, MensagemGerada mensagem) {

		StringBuilder bs = new StringBuilder();

		bs.append(cadastro.getNome());
		bs.append(cadastro.getCpf());
		bs.append(cadastro.getData());
		bs.append(cadastro.getLogradouro());
		bs.append(cadastro.getComplemento());
		bs.append(cadastro.getBairro());
		bs.append(cadastro.getCidade());
		bs.append(cadastro.getCep());
		bs.append(cadastro.NumeroDoProtocolo());
		mensagem.Mensagem();
		

		
		
		
		String valorFormatado =  NumberFormat.getCurrencyInstance().format(cadastro.getValor());
		bs.append(valorFormatado);
		

		return bs.toString();
	}
}
