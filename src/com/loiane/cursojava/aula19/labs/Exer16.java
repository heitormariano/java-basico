package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		int[] arrayA = new int[10];

		int somaMenores15 = 0;
		int qtdIgual15 = 0;

		int qtdMaiores15 = 0;
		int somaMaiores15 = 0;
		int mediaMaiores15 = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Informe o elemento " + i + " :");
			arrayA[i] = scan.nextInt();
			if (arrayA[i] < 15) {
				somaMenores15 += arrayA[i];
			} else if (arrayA[i] == 15) {
				qtdIgual15++;
			} else if (arrayA[i] > 15) {
				somaMaiores15 += arrayA[i];
				qtdMaiores15++;
			}
		}

		mediaMaiores15 = somaMaiores15 / qtdMaiores15;

		System.out.println("a) Soma dos elementos menores que 15:" + somaMenores15);
		System.out.println("b) Quantidade de elementos iguais a 15: " + qtdIgual15);
		System.out.println("c) Media dos elementos superiores a 15: " + mediaMaiores15);

	}
}
