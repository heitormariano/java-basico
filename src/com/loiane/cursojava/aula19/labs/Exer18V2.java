package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer18V2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] idades = new int[10];

		for (int i = 0; i < idades.length; i++) {
			System.out.println("Digite o elemento " + i + " :");
			idades[i] = scan.nextInt();
		}
		
		int maior = idades[0];
		int menor = idades[0];
		int posMaior = 0;
		int posMenor = 0;
		
		for (int i = 1; i < idades.length; i++){ //o maior e menor já são inicializados com o elemento da posição 0
			if (idades[i] > maior) {
				maior = idades[i];
				posMaior = i;
			} else if (idades[i] < menor) {
				menor = idades[i];
				posMenor = i;
			}
		}
		
		System.out.print("Array de idades = ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		
		System.out.println("Maior elemento: " + maior + " - Posição: " + posMaior);
		System.out.println("Menor elemento: " + menor + " - Posição: " + posMenor);
	}
}
