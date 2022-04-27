package servico;

public enum Local {
	BRAZIL ("BR"),
	ARGENTINA ("AR"),
	CHINA ("CN");

	private String sigla;

	private Local(String sigla) {
		 this.sigla = sigla;
			}

	public String getSigla() {
		return sigla;
	}
}
