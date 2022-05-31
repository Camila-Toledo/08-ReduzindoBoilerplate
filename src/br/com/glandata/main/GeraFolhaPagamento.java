package br.com.glandata.main;

import br.com.glandata.model.FolhaPagamento;

public class GeraFolhaPagamento {

	public static void main(String[] args) {

		FolhaPagamento folhaGian = new FolhaPagamento();
		folhaGian.setDiasTrabalhados(30);
		folhaGian.setFaltas(2);
		folhaGian.setSalarioDia(580);
		
		FolhaPagamento folhaAlessandra = new FolhaPagamento();
		folhaAlessandra.setDiasTrabalhados(30);
		folhaAlessandra.setFaltas(2);
		folhaAlessandra.setSalarioDia(590);
		
		System.out.println(folhaGian);
	}

}
