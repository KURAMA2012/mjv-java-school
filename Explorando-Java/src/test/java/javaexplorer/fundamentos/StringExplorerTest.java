package javaexplorer.fundamentos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringExplorerTest {
	@DisplayName("Single test successful")
	@Test
	void testeContainsMethod() {
		
		String palavra = "gleyson";
		boolean expecativa = true;
		boolean resultado = palavra.contains("gl");
		Assertions.assertTrue(resultado);
		
		resultado = palavra.contains("oliveira");
		Assertions.assertFalse(resultado);
		
	}
	@DisplayName("Testando o metodo contains da classe String")
	@Test
	public void testeContainsMethodFalse() {
		String palavra "gleyson";
		
		boolean resultado = palavra.contains("son");
		Assertions.assertFalse(resultado);
	}
}
