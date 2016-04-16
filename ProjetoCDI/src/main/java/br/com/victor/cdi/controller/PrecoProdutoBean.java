package br.com.victor.cdi.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.victor.cdi.service.CalculadoraPreco;

@Named
@RequestScoped
public class PrecoProdutoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CalculadoraPreco calculadora;
	
	@PostConstruct
	public void init(){
		System.out.println("Init PrecoProdutoBean");
	}
	
	private String nome;
	
	public double getPreco(){
		return calculadora.calcularPreco(12, 44.55);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
