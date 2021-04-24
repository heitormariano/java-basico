package com.loiane.cursojava.aula47;

public class Excecao {

	public static void main(String[] args) {
		try {
			int[] vetor = new int[4];

			System.out.println("Antes da Exception");

			vetor[4] = 10;

			System.out.println("Este texto não será impresso");
		} catch (IndexOutOfBoundsException exception) {
			System.out.println("Exceção ao tentar acessar índice inexistente no vetor");
		}

		System.out.println("Este texto será impresso após a exception");

	}
}
