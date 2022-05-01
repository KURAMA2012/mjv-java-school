package util;

public enum TipoServico {

	ÁGUA("A", 137.21), LUZ("L", 132.15);

	private String sigla;
	private Double valor;

	private TipoServico(String sigla, Double valor) {
		this.sigla = sigla;
		this.valor = valor;

	}

	public String getString() {
		return sigla;
	}

	public Double getValor() {
		return valor;
	}

	Object getSigla() {
		return sigla;
	}

}
