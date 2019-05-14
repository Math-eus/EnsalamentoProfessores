package br.sc.senai.ensalaprof.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.sc.senai.ensalaprof.domain.enums.NivelFormacao;

@Entity
public class Formacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @Enumerated(EnumType.STRING)
	private NivelFormacao formacao_nivel;
	private String formacao_nome;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public NivelFormacao getFormacao_nivel() {
		return formacao_nivel;
	}

	public void setFormacao_nivel(NivelFormacao formacao_nivel) {
		this.formacao_nivel = formacao_nivel;
	}

	public String getFormacao_nome() {
		return formacao_nome;
	}

	public void setFormacao_nome(String formacao_nome) {
		this.formacao_nome = formacao_nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Formacao other = (Formacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
