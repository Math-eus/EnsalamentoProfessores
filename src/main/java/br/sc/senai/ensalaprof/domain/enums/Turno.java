package br.sc.senai.ensalaprof.domain.enums;

public enum Turno {
	MATUTINO("Matutino"), VESPERTINO("Vespertino"), NOTURNO ("Noturno");
	
	private String label;
	
	private Turno (String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
