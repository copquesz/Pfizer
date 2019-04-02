package br.com.pfizer.enumerated;

import lombok.Getter;

@Getter
public enum Sexo {
	
	MASCULINO(0, "Masculino"),
	FEMININO(1, "Feminino");
	
	private int id;
	private String descricao;
	
	Sexo(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

}
