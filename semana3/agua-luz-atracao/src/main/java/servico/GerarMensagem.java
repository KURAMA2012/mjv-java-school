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
		
		System.out.println("Senhor(a) " + pessoa.getNome() + " cpf de n�mero " + pessoa.getCpf()
		+ ", Informamos que conforme contrato com protocolo de n�mero " + contrato.NumeroDoProtocolo()
		+ " est� agendado para a data " + (formatDataHora) + " a instala��o do servi�o de " + contrato.getTiposervico().getString() +" com taxa de valor "
		+ (valorFormatado) + " em sua resid�ncia localizada no endere�o abaixo: ");
		
		
		
		bs.append(pessoa.getLogradouro());
		bs.append(pessoa.getBairro());
		bs.append(pessoa.getCidade());
		bs.append(pessoa.getComplemento());
		bs.append(pessoa.getCep());
		
		
		String.format("%014d", Long.valueOf(pessoa.getCpf().replaceAll("\\D", "")));

		return bs.toString();
	}
	
	     }
