package util;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatadorUtil {
	public static String formatarCpf(String cpf) {
		String part1 = cpf.substring(0, 3);
		String part2 = cpf.substring(3, 6);
		String part3 = cpf.substring(6, 9);
		String part4 = cpf.substring(9, 11);
		String cpfFormatador = String.format("%s.%s.%s.%s", part1, part2, part3, part4);
		return cpfFormatador;
	}
	
	public static String formatarCep(String cpf) {
		String part1 = cpf.substring(0, 2);
		String part2 = cpf.substring(2, 5);
		String part3 = cpf.substring(5, 8);
		String cepFormatador = String.format("%s.%s.%s", part1, part2, part3);
		return cepFormatador;
	}

	public static String formatarValor(Double valor) {

		String valorFormatado = NumberFormat.getCurrencyInstance().format(valor);
		return valorFormatado;

	}

	public static String formatarData(LocalDateTime dataHora) {
		DateTimeFormatter dataHoraFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String formatter = dataHora.format(dataHoraFormatada);
		return formatter;
	}
	
	
	public static String formatarCelular(String celular) {
		String part1 = celular.substring(0, 2);
		String part2 = celular.substring(2, 7);
		String part3 = celular.substring(7, 11);
		String celularFormatado = String.format("(%s) %s-%s",part1,part2,part3);
		return celularFormatado;
	}
	public static String formatarRg(String rg) {
		String part1 = rg.substring(0, 5);
		String part2 = rg.substring(5, 6);
		String rgFormatado = String.format("%s-%s",part1,part2);
		return rgFormatado;
	}

}
