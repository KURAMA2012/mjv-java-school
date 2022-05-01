package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import util.Notificacao;
import util.TipoServico;

public class Contrato {

	private Long numeroProtoloco;
	private Cadastro cadastro;
	private Double valor;
	private LocalDateTime dataHora;
	private LocalDate data;
	private LocalTime hora;
	private TipoServico tiposervico;
	private Notificacao tipoNotificacao;

	public Long getNumeroProtoloco() {
		return numeroProtoloco;
	}

	public void setNumeroProtoloco(Long numeroProtoloco) {
		this.numeroProtoloco = numeroProtoloco;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public TipoServico getTiposervico() {
		return tiposervico;
	}

	public void setTiposervico(TipoServico tiposervico) {
		this.tiposervico = tiposervico;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public Notificacao getTipoNotificacao() {
		return tipoNotificacao;
	}

	public void setTipoNotificacao(Notificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Contrato [numeroProtoloco=" + numeroProtoloco + ", cadastro=" + cadastro + ", valor=" + valor
				+ ", dataHora=" + dataHora + ", data=" + data + ", hora=" + hora + ", tiposervico=" + tiposervico
				+ ", tipoNotificacao=" + tipoNotificacao + "]";
	}

}
