package modal;

public enum Notificacao {
	SMS("S","Mensagem SMS"), WHATS("W","Mensagem Whatsapp");

	private String notificar;
	private String descricao;

	private Notificacao(String notificar , String descricao) {
		this.notificar = notificar;
		this.descricao = descricao;
	}

	public String getNotificar() {
		return notificar;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
