package com.loiane.cursojava.aula34;

public class TesteCalculadora {

	static int resultSoma;
	public static void main(String[] args) {
		//MinhaCalculadora calc = new MinhaCalculadora();

		System.out.println(MinhaCalculadora.soma(1, 2));
		System.out.println(MinhaCalculadora.soma(5.5, 6.6));

		int[] elementos = { 1, 2, 3 };

		System.out.println(MinhaCalculadora.soma(elementos));
		
		resultSoma = MinhaCalculadora.soma(3, 4, 5);
		System.out.println("Resultado (uso de static) :" + resultSoma);
	}
}
