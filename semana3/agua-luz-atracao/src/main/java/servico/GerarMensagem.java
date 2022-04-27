package servico;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import domain.Contrato;
import domain.Pessoa;

public class GerarMensagem {
	public void mensagem(Pessoa pessoa, Contrato contrato) {

		
		String valorFormatado = NumberFormat.getCurrencyInstance().format(contrato.getValor());

		String formatDataHora = LocalDateTime.of(2022, 02, 21, 16, 00).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		String.format("%014d", Long.valueOf(pessoa.getCpf().replaceAll("\\D", "")));

		System.out.println("Senhor(a) " + pessoa.getNome() + " cpf de n�mero " + pessoa.getCpf()
				+ ", Informamos que conforme contrato com protocolo de n�mero " + contrato.NumeroDoProtocolo()
				+ " est� agendado para a data " + (formatDataHora) + " a instala��o do servi�o de " + contrato.getTiposervico().getString() +" com taxa de valor "
				+ (valorFormatado) + " em sua resid�ncia localizada no endere�o abaixo:" + "\nLogradouro: " + pessoa.getLogradouro() + "\nComplemento: "
				+ pessoa.getComplemento() + "\nBairro: " + pessoa.getBairro() + "\nCidade: " + pessoa.getCidade() + "\nCep: " + pessoa.getCep());
	}
	
	     }
