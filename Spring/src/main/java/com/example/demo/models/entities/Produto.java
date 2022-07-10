package com.example.demo.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	private double preco;
	
	@NotBlank
	private String nome;
	
	@Min(0)
	@Max(5)
	private int desconto;
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (getDesconto() < 1) {
			this.preco = preco;
		} else {
			this.preco =  preco - (preco / (double) getDesconto());
		}

	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		if (desconto > 5 ) {
			return;
		} else if (desconto < 6) {
			this.desconto = desconto;
		}

	}

	public Produto(String nome) {
		super();
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
