package domain;

import servico.GerarArquivo;
import servico.GerarMensagem;
import servico.TipoServico;

public class IniciarSistema {
	public static void main(String[] args) {

		TipoServico tiposervico1 = TipoServico.ÁGUA;
		TipoServico tiposervico2 = TipoServico.LUZ;

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Gleyson Sampaio");
		pessoa.setCpf("234.765.987-27");

		pessoa.setLogradouro("Rua das Marias, 243");
		pessoa.setComplemento("Ap 207, Bloco C");
		pessoa.setBairro("Santo Antonio");
		pessoa.setCidade("São Paulo / SP");
		pessoa.setCep("27.310-657");

		Contrato contrato = new Contrato();
		contrato.NumeroDoProtocolo();
		contrato.setValor(137.21);
		contrato.setTiposervico(tiposervico1);

		GerarMensagem gc = new GerarMensagem();
		gc.mensagem(pessoa, contrato);
		
		GerarArquivo gr = new GerarArquivo();
		

	}

}
