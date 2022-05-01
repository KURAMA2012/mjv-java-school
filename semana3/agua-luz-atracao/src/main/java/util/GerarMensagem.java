package util;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.Cadastro;
import model.Contrato;

public class GerarMensagem {

	public void mensagem(Cadastro pessoa, Contrato contrato) {

		String cpfFormatado = FormatadorUtil.formatarCpf(pessoa.getCpf());
		
		StringBuilder sb = new StringBuilder();
		String valorFormatado = NumberFormat.getCurrencyInstance().format(contrato.getValor());
		String formatDataHora = LocalDateTime.of(2022, 02, 21, 16, 00).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
			
		sb.append(String.format("Senhor(a) %s cpf de número %s, ",pessoa.getNome(), cpfFormatado ));
		sb.append(String.format("Informamos que conforme contrato com protocolo de número %d", contrato.getNumeroProtoloco()));
		
		
		System.out.println(sb.toString());

	}

}
