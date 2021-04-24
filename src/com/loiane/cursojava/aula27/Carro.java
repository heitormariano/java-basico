package com.loiane.cursojava.aula27;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " Km");
	}

	double obterAutonomia() {
		System.out.println("O m�todo obterAutonomia foi chamado.");

		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double percursoKm) {
		double qtdCombustivel = percursoKm / consumoCombustivel;
		return qtdCombustivel;
	}
}
