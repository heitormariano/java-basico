package com.loiane.cursojava.aula17.labs;

public class Exer16 {
	public static void main(String[] args) {
		// Fibonacci (incluindo o 0): 0, 1, 1,2,3, 5,8, 13, 21 ...

		int primeiro = 0;
		int segundo = 1;
		int proximo = 0;

		System.out.println("Gerando números da série de Fibonacci até que o último termo seja maior que 500");
		System.out.println(primeiro);
		while (proximo <= 500) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.println(proximo);
		}
	}
}
