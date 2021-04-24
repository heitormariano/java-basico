package com.loiane.cursojava.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	Carro() {
		System.out.println("Classe Carro foi instanciada");
		numPassageiros = 4;
	}
	
	Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel){
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
	}

	double obterAutonomia() {
		System.out.println("O método obterAutonomia foi chamado.");

		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double percursoKm) {
		double qtdCombustivel = percursoKm / consumoCombustivel;
		return qtdCombustivel;
	}
}
