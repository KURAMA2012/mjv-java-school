package com.mjv.notificationcase;

public class MensagemGerada {
	
	Cadastro cadastro = new Cadastro();
	public String  Mensagem() {
		System.out.println("Senhor(a) " + cadastro.getNome() +  "cpf de n�mero" + cadastro.getCpf() + ", Informamos que conforme contrato com protocolo de n�mero" + cadastro.NumeroDoProtocolo() + " est� agendado para a data" + cadastro.getData() +
				"a instala��o do servi�o de �gua com taxa de valor" + cadastro.getValor() + "em sua resid�ncia localizada no endere�o abaixo:");
		return  null;
	}

}
