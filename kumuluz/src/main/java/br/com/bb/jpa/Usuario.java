package br.com.bb.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String nome;

	public Usuario() {
	}
	
	
	
	public Usuario(String nome) {
		this.nome = nome;
	}



	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}



	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + "]";
	}
	
	
	
	
	
	
}
