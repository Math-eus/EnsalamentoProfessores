package br.sc.senai.ensalaprof.domain.enums;

public enum NivelFormacao {
	TECNICO("Técnico"), SUPERIOR("Superior"), MESTRADO ("Mestrado"), DOUTOURADO("Doutorado"), PHD("PhD");
	
	private String label;
	
	private NivelFormacao (String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
