package com.loiane.cursojava.aula27;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println("Carro 1");
		System.out.println(van.marca);
		System.out.println(van.modelo);

		System.out.println("Usando m�todo sem retorno");
		van.exibirAutonomia();

		System.out.println("Usando m�todo como retorno");
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro �: " + autonomia);
		// outra forma de uso
		System.out.println("A autonomia do carro � " + van.obterAutonomia());

		System.out.println("Usando m�todo como argumentos");
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);

		System.out.println("Qtd combust�vel para um percurso de 10Km: " + qtdCombustivel10);
		System.out.println("Qtd combust�vel para um percurso de 15Km: " + qtdCombustivel15);
	}
}
