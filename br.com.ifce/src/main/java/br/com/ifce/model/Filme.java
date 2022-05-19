package br.com.ifce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filme {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
	 private String titulo;
     private String data;
     private double preco;
     private int duracao;
     
     public Long getId() {
 		return id;
 	}

 	public void setId(Long id) {
 		this.id = id;
 	}
	
	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public int getDuracao() {
		return duracao;
	}



	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	 
	
}
