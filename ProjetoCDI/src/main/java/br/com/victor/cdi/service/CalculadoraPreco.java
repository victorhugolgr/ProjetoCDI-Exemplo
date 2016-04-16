package br.com.victor.cdi.service;


public class CalculadoraPreco {

	public CalculadoraPreco() {
		System.out.println("Calculadora Preço");
	}
	
	public double calcularPreco(int quantidade, double precoUnitario){
		return quantidade * precoUnitario;
	}
	
}
