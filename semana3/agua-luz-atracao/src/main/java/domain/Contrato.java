package domain;

import java.time.LocalDate;

import servico.TipoServico;

public class Contrato {

	private Double valor;
	private LocalDate data;
	private TipoServico tiposervico;

	public Contrato() {

	}

	public Contrato(Double valor, LocalDate data, TipoServico tiposervico) {
		super();
		this.valor = valor;
		this.data = data;
		this.tiposervico = tiposervico;
	}

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

	@Override
	public String toString() {
		return "Contrato [valor=" + valor + ", data=" + data + ", tiposervico=" + tiposervico + "]";
	}

	
}
