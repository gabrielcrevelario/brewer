package com.gclick.brewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {
	
	private int estoque;
	private double teor_alcolico;
	
	@NotBlank(message = "SKU é obrigatório")
	private String sku;
	
	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	
	@Size(min = 1, max = 50, message = "O tamanho da descrição deve estar entre 1 e 50")
	private String descricao;
	
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getTeor_alcolico() {
		return teor_alcolico;
	}
	public void setTeor_alcolico(double teor_alcolico) {
		this.teor_alcolico = teor_alcolico;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
