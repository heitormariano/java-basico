package com.loiane.cursojava.aula26;

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
}
