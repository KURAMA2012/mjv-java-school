package com.mjv.notificationcase;

import java.time.LocalDate;

public class Contrato {

	private Double valor;
	private LocalDate data;
	private TipoServico tiposervico;

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String NumeroDoProtocolo() {
		return "2022025687";
	}

	public TipoServico getTiposervico() {
		return tiposervico;
	}

	public void setTiposervico(TipoServico tiposervico) {
		this.tiposervico = tiposervico;
	}
	

	

}
