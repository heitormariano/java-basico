package com.loiane.cursojava.aula31;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	public Carro() {
	}

	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " Km");
	}

	public double obterAutonomia() {
		System.out.println("O método obterAutonomia foi chamado.");

		return this.capCombustivel * this.consumoCombustivel;
	}

	//método privado: é visível apenas para a classe (acessado dentro da própria classe)
	private double divideKmPorCosumoCombustivel(double percursoKm) {
		return percursoKm / this.consumoCombustivel;
	}

	public double calcularCombustivel(double percursoKm) {
		double qtdCombustivel = this.divideKmPorCosumoCombustivel(percursoKm);
		return qtdCombustivel;
	}
}
