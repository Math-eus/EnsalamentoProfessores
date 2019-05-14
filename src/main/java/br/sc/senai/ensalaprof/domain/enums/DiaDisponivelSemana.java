package br.sc.senai.ensalaprof.domain.enums;

public enum DiaDisponivelSemana {
	SEGUNDA("Segunda"), TERCA("Terça"), QUARTA("Quarta"), QUINTA("Quinta"), SEXTA("Sexta");
	
	private String label;
	
	private DiaDisponivelSemana(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
