package br.sc.senai.ensalaprof.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.sc.senai.ensalaprof.domain.enums.DiaDisponivelSemana;
import br.sc.senai.ensalaprof.domain.enums.Turno;


@Entity
public class Professor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	@Enumerated(EnumType.STRING)
	private DiaDisponivelSemana dias_disponiveis_semana;
	private Long carga_horaria_semana;
	private Turno turno;

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

	public DiaDisponivelSemana getDias_disponiveis_semana() {
		return dias_disponiveis_semana;
	}

	public void setDias_disponiveis_semana(DiaDisponivelSemana dias_disponiveis_semana) {
		this.dias_disponiveis_semana = dias_disponiveis_semana;
	}

	public Long getCarga_horaria_semana() {
		return carga_horaria_semana;
	}

	public void setCarga_horaria_semana(Long carga_horaria_semana) {
		this.carga_horaria_semana = carga_horaria_semana;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
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
		Professor other = (Professor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
