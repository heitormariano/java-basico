package com.loiane.cursojava.aula34.labs;

public class Exer01 {

	public static void main(String[] args) {
		// antes de qualquer opera��o, ver o valor do contador
		imprimirValor();

		// instanciando a classe Contador, seguindo o exerc�cio
		System.out.println("Criando objetos do tipo Contador");
		Contator c1 = new Contator();
		Contator c2 = new Contator();
		Contator c3 = new Contator();
		imprimirValor();

		System.out.println("Acesso aos m�todos est�ticos da classe Contador");
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
