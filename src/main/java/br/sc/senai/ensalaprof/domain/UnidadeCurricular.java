package br.sc.senai.ensalaprof.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.sc.senai.ensalaprof.domain.enums.DiaHoraAtividade;

@Entity
public class UnidadeCurricular implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Long carga_horaria;
	@Enumerated(EnumType.STRING)
	private DiaHoraAtividade hora_atividade;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(Long carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	public DiaHoraAtividade getHora_atividade() {
		return hora_atividade;
	}

	public void setHora_atividade(DiaHoraAtividade hora_atividade) {
		this.hora_atividade = hora_atividade;
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
		UnidadeCurricular other = (UnidadeCurricular) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}