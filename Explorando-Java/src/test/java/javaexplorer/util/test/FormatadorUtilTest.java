package javaexplorer.util.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import util.FormatadorUtil;

public class FormatadorUtilTest {
	@DisplayName("Testando o metodo de formatacao de cep")
	@Test
	public void formatacaoValidaCepTest() {
		
		String parametro = "65.300-123";
		String resultado = FormatadorUtil.formatarCep(parametro);
		
		
		String expectativa = "65.300-123";
		
		Assertions.assertEquals(expectativa, resultado);
		
}
	@DisplayName("Testando o metodo de formatacao de cep")
	@Test
	public void formatacaoCepSemOsOitoDigitos() {
		
		String parametro = "5623598";
		String resultado = FormatadorUtil.formatarCep(parametro);
		
		
		String expectativa = "05.623-598";
		
		Assertions.assertEquals(expectativa, resultado);
}
	}
