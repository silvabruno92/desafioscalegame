package br.api.rest.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resultado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long tempoVitoria;
	private String nome;
	private int numeroChutes;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getTempoVitoria() {
		return tempoVitoria;
	}
	public void setTempoVitoria(Long tempoVitoria) {
		this.tempoVitoria = tempoVitoria;
	}
	public int getNumeroChutes() {
		return numeroChutes;
	}
	public void setNumeroChutes(int numeroChutes) {
		this.numeroChutes = numeroChutes;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}


}
