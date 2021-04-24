package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] idades = new int[10];

		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		int posMaior = 0;
		int posMenor = 0;

		for (int i = 0; i < idades.length; i++) {
			System.out.println("Digite o elemento " + i + " :");
			idades[i] = scan.nextInt();
			if (idades[i] > maior) {
				maior = idades[i];
				posMaior = i;
			}
			if (idades[i] < menor) {
				menor = idades[i];
				posMenor = i;
			}
		}
		System.out.println("O maior elementos: " + maior + " - Posição: " + posMaior);
		System.out.println("O menor elemento: " + menor + " - Posição: " + posMenor);
	}
}
