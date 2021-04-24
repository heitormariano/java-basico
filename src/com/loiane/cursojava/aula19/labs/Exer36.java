package com.loiane.cursojava.aula19.labs;

public class Exer36 {

	public static void main(String[] args) {
		//O exercício indica o uso de um array de inteiros
		//A resposta sugerida pelo curso usa um array de elementos do tipo double
		int[] arrayA = new int[11];

		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int) Math.pow(2, i);
		}

		System.out.print("Array A: ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}
	}
}
