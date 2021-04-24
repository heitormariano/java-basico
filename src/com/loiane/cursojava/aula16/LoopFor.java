package com.loiane.cursojava.aula16;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("O valor de i = " + i);
		}

		System.out.println();

		for (int i = 5; i >= 0; i--) {
			System.out.println("O valor de i = " + i);
		}

		System.out.println();

		// for com mais de uma variavel
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("O valor de i = " + i + " -- O valor de j = " + j);
		}

		System.out.println();
		// for com partes ausentes (não é muito comum). Usado em casos
		// específicos
		int count = 0;
		for (; count < 10;) {
			System.out.println("O valor de count = " + count);
			count += 2;
		}
		System.out.println();

		// exemplo equivalente ao for de cima
		for (int cont = 0; cont < 10; cont += 2) {
			System.out.println("O valor de cont = " + cont);
		}

		// loop infinito
		/*
		 * for(; ;){ System.out.println("Loop Infinitoooo"); }
		 */
		System.out.println();

		// for sem corpo
		int soma = 0;
		for (int i = 1; i < 5; soma += i++);
		System.out.println("O valor de soma = " + soma);
	}
}
