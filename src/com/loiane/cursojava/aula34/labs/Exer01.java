package com.loiane.cursojava.aula34.labs;

public class Exer01 {

	public static void main(String[] args) {
		// antes de qualquer operação, ver o valor do contador
		imprimirValor();

		// instanciando a classe Contador, seguindo o exercício
		System.out.println("Criando objetos do tipo Contador");
		Contator c1 = new Contator();
		Contator c2 = new Contator();
		Contator c3 = new Contator();
		imprimirValor();

		System.out.println("Acesso aos métodos estáticos da classe Contador");
		Contator.incrementar();
		Contator.incrementar();
		Contator.incrementar();

		imprimirValor();
		Contator.zerar();
		imprimirValor();

		Contator.incrementar();
		imprimirValor();
	}

	public static void imprimirValor() {
		System.out.println(Contator.obterValor());
	}
}
