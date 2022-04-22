package com.mjv.notificationcase;

import java.time.LocalDateTime;

public class Contrato {
	public static void main(String[] args)  {

		Cadastro cadastro = new Cadastro();
		cadastro.setNome("Gleyson Sampaio");
		cadastro.setCpf("234.765.987-27");
		cadastro.setData(LocalDateTime.of(2022, 02, 21, 16, 00));
		cadastro.setLogradouro("Rua das Marias, 243");
		cadastro.setComplemento("Ap 207, Bloco C");
		cadastro.setBairro("Santo Antonio");
		cadastro.setCidade("São Paulo / SP");
		cadastro.setCep("27.310-657");
		cadastro.setValor(127.33);
		cadastro.NumeroDoProtocolo();
		
		MensagemGerada mensagem = new MensagemGerada();
		mensagem.Mensagem();
		
		
		
		

		GerarMensagem gc = new GerarMensagem();
		String conteudoGerador = gc.gerar(cadastro, mensagem);
		

		System.out.println(conteudoGerador);
	}

}
