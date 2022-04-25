package com.mjv.notificationcase;

public enum TipoServico {
	
	ÁGUA ("A"),
	LUZ ("L");
	
	private String sigla;
	
	private TipoServico (String sigla) {
		this.sigla = sigla;
	}
	
	public String getString() {
		return sigla;
	}

}
