package pacote.de.servicos;

public enum TipoNotificacao {
	SMS ("S"), WHATSAPP("w");

	private String sigla;

	private TipoNotificacao(String sigla) {
		this.sigla = sigla;

	}

	public String getSigla() {
		return sigla;
	}
}