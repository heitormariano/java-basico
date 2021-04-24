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
		System.out.println("A autonomia do carro �: " + this.capCombustivel * this.consumoCombustivel + " Km");
	}

	public double obterAutonomia() {
		System.out.println("O m�todo obterAutonomia foi chamado.");

		return this.capCombustivel * this.consumoCombustivel;
	}

	//m�todo privado: � vis�vel apenas para a classe (acessado dentro da pr�pria classe)
	private double divideKmPorCosumoCombustivel(double percursoKm) {
		return percursoKm / this.consumoCombustivel;
	}

	public double calcularCombustivel(double percursoKm) {
		double qtdCombustivel = this.divideKmPorCosumoCombustivel(percursoKm);
		return qtdCombustivel;
	}
}
