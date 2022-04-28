package com.mjv.agualuz.notification.service;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.util.FormatadorUtil;

public class GeradorMensagem {
	public void gerar(Contrato contrato) {
		StringBuilder sb = new StringBuilder();
		Cadastro cliente = contrato.getCliente();
		String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
		String dataFormatada = FormatadorUtil.formatarData(contrato.getDataHora());
		String valor = FormatadorUtil.formatarValor(contrato.getValor());
		 
		 
		//sb.append("Senhor(a) " + cliente.getNome() +" cpf de número " + cpfFormatado );
		sb.append(String.format("Senhor(a) %s cpf de número %s, ",cliente.getNome(), cpfFormatado ));
		sb.append(String.format("Informamos que conforme contrato com protocolo de número %d  ", contrato.getNumeroProtocolo()));
		sb.append(dataFormatada);
		sb.append(String.format("a instalação do serviço de %s com taxa de valor R$ %.2f em sua residência localizada no endereço abaixo:\n", contrato.getServico(), contrato.getValor()));
		
		System.out.println(sb.toString());
	}
}
