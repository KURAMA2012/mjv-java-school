package app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import model.Cadastro;
import model.Contrato;
import model.Endereco;
import util.GerarArquivo;
import util.Local;
import util.Notificacao;
import util.PreparandoArquivo;
import util.TipoServico;

public class IniciarSistema {
	public static void main(String[] args) {

		TipoServico tiposervico1 = TipoServico.ÁGUA;
		TipoServico tiposervico2 = TipoServico.LUZ;
		Local pais = Local.BRAZIL;
		Notificacao notificar1 = Notificacao.WHATS;

		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Sebastião Firmino");
		endereco.setComplemento("Ap 207, Bloco C");
		endereco.setBairro("Santo Antonio");
		endereco.setCidade("São Paulo / SP");
		endereco.setCep("07210715");
		endereco.setNumero("123");
		endereco.setUf("Sp");
		endereco.setPais(pais);

		Cadastro pessoa = new Cadastro();
		pessoa.setNome("Gleyson Sampaio");
		pessoa.setCpf("23476598727");
		pessoa.setEndereco(endereco);
		pessoa.setRg("337655");
		pessoa.setCelular("11997681515");

		Contrato contrato = new Contrato();
		contrato.setNumeroProtoloco(1984365L);
		contrato.setValor(137.21);
		contrato.setTiposervico(tiposervico1);
		contrato.setHora(LocalTime.now());
		contrato.setData(LocalDate.now());
		contrato.setDataHora(LocalDateTime.now());
		contrato.setTipoNotificacao(notificar1);


		PreparandoArquivo gcCsv = new PreparandoArquivo();
		String conteudoGeradorCsv = gcCsv.prepararConteudoArquivoCSV(pessoa, contrato);

		PreparandoArquivo gcTxt = new PreparandoArquivo();
		String conteudoGeradorTxt = gcTxt.prepararConteudoArquivoTXT(pessoa, contrato);

		GerarArquivo gr = new GerarArquivo();
		gr.gerarArquivoCsv(conteudoGeradorCsv);
		gr.gerarArquivoTxt(conteudoGeradorTxt);

	}

}
