package model;

import util.Local;

public class Endereco {

	private String logradouro;
	private String numero;
	private String estado;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;
	private Local pais;

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Local getPais() {
		return pais;
	}

	public void setPais(Local pais) {
		this.pais = pais;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", estado=" + estado + ", complemento="
				+ complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", uf=" + uf + ", pais="
				+ pais + "]";
	}

	

}
