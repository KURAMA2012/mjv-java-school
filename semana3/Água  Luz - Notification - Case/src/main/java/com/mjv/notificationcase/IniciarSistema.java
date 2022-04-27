package com.mjv.notificationcase;

public class IniciarSistema {
	public static void main(String[] args) {

		TipoServico tiposervico1 = TipoServico.ÁGUA;
		TipoServico tiposervico2 = TipoServico.LUZ;

		Cadastro cadastro = new Cadastro();

		cadastro.setNome("Gleyson Sampaio");
		cadastro.setCpf("234.765.987-27");

		cadastro.setLogradouro("Rua das Marias, 243");
		cadastro.setComplemento("Ap 207, Bloco C");
		cadastro.setBairro("Santo Antonio");
		cadastro.setCidade("São Paulo / SP");
		cadastro.setCep("27.310-657");

		Contrato contrato = new Contrato();
		contrato.NumeroDoProtocolo();
		contrato.setValor(137.21);
		contrato.setTiposervico(tiposervico1);

		GerarMensagem gc = new GerarMensagem();
		gc.mensagem(cadastro, contrato);

	}

}
