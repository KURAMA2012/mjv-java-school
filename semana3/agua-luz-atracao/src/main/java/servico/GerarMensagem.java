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

		System.out.println("Senhor(a) " + pessoa.getNome() + " cpf de número " + pessoa.getCpf()
				+ ", Informamos que conforme contrato com protocolo de número " + contrato.NumeroDoProtocolo()
				+ " está agendado para a data " + (formatDataHora) + " a instalação do serviço de " + contrato.getTiposervico().getString() +" com taxa de valor "
				+ (valorFormatado) + " em sua residência localizada no endereço abaixo:" + "\nLogradouro: " + pessoa.getLogradouro() + "\nComplemento: "
				+ pessoa.getComplemento() + "\nBairro: " + pessoa.getBairro() + "\nCidade: " + pessoa.getCidade() + "\nCep: " + pessoa.getCep());
	}
	
	     }
