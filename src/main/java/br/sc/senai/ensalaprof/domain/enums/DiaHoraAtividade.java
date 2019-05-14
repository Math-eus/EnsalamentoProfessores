package br.sc.senai.ensalaprof.domain.enums;

public enum DiaHoraAtividade {
	SEGUNDA("Segunda"), TERCA("Terça"), QUARTA("Quarta"), QUINTA("Quinta"), SEXTA("Sexta");
	
	private String label;
	
	private DiaHoraAtividade (String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
