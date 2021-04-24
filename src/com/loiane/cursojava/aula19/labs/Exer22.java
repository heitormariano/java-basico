package com.loiane.cursojava.aula19.labs;

public class Exer22 {

	public static void main(String[] args) {
		int[] arrayA = new int[10];

		double qtd0 = 0;
		double qtd1 = 0;

		double perc0 = 0;
		double perc1 = 0;

		double total = arrayA.length;

		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int) Math.round(Math.random() * 1);
			if (arrayA[i] == 0) {
				qtd0++;
			} else {
				qtd1++;
			}
		}

		System.out.print("Array A = ");
		// brincando com foreach
		for (int elem : arrayA) {
			System.out.print(elem + " ");
		}

		perc0 = (qtd0 / total) * 100;
		perc1 = (qtd1 / total) * 100;

		System.out.println();
		System.out.println("Percentual de elementos iguais a 0 : " + perc0);
		System.out.println("Percentual de elementos iguais a 1 : " + perc1);
	}
}
