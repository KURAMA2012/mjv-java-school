package model;

public enum Local {
	BRAZIL ("BR"),
	ARGENTINA ("AR"),
	CHINA ("CN");

	private String descricao;

	private Local(String descricao) {
		 this.descricao = descricao;
			}

	public String getSigla() {
		return descricao;
	}
}
