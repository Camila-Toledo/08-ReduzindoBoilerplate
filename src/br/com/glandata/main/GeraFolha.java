package br.com.glandata.main;

import br.com.glandata.model.Colaborador;
import br.com.glandata.model.FolhaPagamento;

public class GeraFolha {

	public static void main(String[] args) {

		Colaborador colaborador = new Colaborador("Camila", 123456);

		FolhaPagamento folha = new FolhaPagamento(colaborador);
		folha.setDiasTrabalhados(30);
		folha.setFaltas(2);
		folha.setSalarioDia(287);

		System.out.println(folha.getColaborador().getNome());
		System.out.println(folha.salario());
	}

}
