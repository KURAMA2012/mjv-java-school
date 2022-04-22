package com.mjv.notificationcase;

public class MensagemGerada {
	
	Cadastro cadastro = new Cadastro();
	public String  Mensagem() {
		System.out.println("Senhor(a) " + cadastro.getNome() +  "cpf de número" + cadastro.getCpf() + ", Informamos que conforme contrato com protocolo de número" + cadastro.NumeroDoProtocolo() + " está agendado para a data" + cadastro.getData() +
				"a instalação do serviço de Água com taxa de valor" + cadastro.getValor() + "em sua residência localizada no endereço abaixo:");
		return  null;
	}

}
