package com.loiane.cursojava.aula47;

public class Excecao {

	public static void main(String[] args) {
		try {
			int[] vetor = new int[4];

			System.out.println("Antes da Exception");

			vetor[4] = 10;

			System.out.println("Este texto n�o ser� impresso");
		} catch (IndexOutOfBoundsException exception) {
			System.out.println("Exce��o ao tentar acessar �ndice inexistente no vetor");
		}

		System.out.println("Este texto ser� impresso ap�s a exception");

	}
}
