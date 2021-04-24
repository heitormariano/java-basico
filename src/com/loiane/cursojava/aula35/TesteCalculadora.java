package com.loiane.cursojava.aula35;

public class TesteCalculadora {

	public static void main(String[] args) {
		int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
		System.out.println("Resultado [fatorial não recursivo]: " + fatorialNR);
		
		int fatorialR = Calculadora.fatorial(5);
		System.out.println("Resultado [fatorial recursivo]: " + fatorialR);
	}
}
