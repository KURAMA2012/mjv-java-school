package servico;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import domain.Contrato;
import domain.Pessoa;

public class GerarMensagem {
	public String mensagem(Pessoa pessoa, Contrato contrato) {

		
		StringBuilder bs = new StringBuilder();
		
		String valorFormatado = NumberFormat.getCurrencyInstance().format(contrato.getValor());
		bs.append(valorFormatado);
		String formatDataHora = LocalDateTime.of(2022, 02, 21, 16, 00).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		bs.append(formatDataHora);
		
		System.out.println("Senhor(a) " + pessoa.getNome() + " cpf de número " + pessoa.getCpf()
		+ ", Informamos que conforme contrato com protocolo de número " + contrato.NumeroDoProtocolo()
		+ " está agendado para a data " + (formatDataHora) + " a instalação do serviço de " + contrato.getTiposervico().getString() +" com taxa de valor "
		+ (valorFormatado) + " em sua residência localizada no endereço abaixo: ");
		
		
		
		bs.append(pessoa.getLogradouro());
		bs.append(pessoa.getBairro());
		bs.append(pessoa.getCidade());
		bs.append(pessoa.getComplemento());
		bs.append(pessoa.getCep());
		
		
		String.format("%014d", Long.valueOf(pessoa.getCpf().replaceAll("\\D", "")));

		return bs.toString();
	}
	
	     }
