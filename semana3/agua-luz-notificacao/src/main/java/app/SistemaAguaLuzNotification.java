package app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import modal.Cadastro;
import modal.Contrato;
import modal.Endereco;
import modal.Local;
import modal.Notificacao;
import modal.TipoServico;
import service.GerarMensagem;

class SistemaAguaLuzNotification {
	public static void main(String[] args) {

		TipoServico tiposervico1 = TipoServico.ÁGUA;
		TipoServico tiposervico2 = TipoServico.LUZ;
		Local pais = Local.BRAZIL;
		Notificacao notificar1 = Notificacao.WHATS;

		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Sebastião Firmino, 243");
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
		contrato.setHora(LocalTime.now());
		contrato.setData(LocalDate.now());
		contrato.setDataHora(LocalDateTime.now());
		contrato.setTipoNotificacao(notificar1);
		contrato.setTiposervico(tiposervico1);

		GerarMensagem gc = new GerarMensagem();
		String geradorNotificacao = gc.mensagem(pessoa, contrato);
	}
}
