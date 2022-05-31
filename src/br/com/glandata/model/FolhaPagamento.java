package br.com.glandata.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class FolhaPagamento {

	public FolhaPagamento() {
	}

	public FolhaPagamento(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	@Getter
	private Colaborador colaborador;

	@Getter
	@Setter
	private Integer diasTrabalhados;

	@Getter
	@Setter
	private float salarioDia;

	@Getter
	@Setter
	private Integer faltas;

	public float salario() {
		float salario = ((diasTrabalhados - faltas) * salarioDia);
		return salario;
	}

}
