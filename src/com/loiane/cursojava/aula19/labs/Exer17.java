package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		int[] idades = new int[10];
		int qtdMaior35 = 0;

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Informe o elemento " + i + " :");
			idades[i] = scan.nextInt();
			if (idades[i] > 35) {
				qtdMaior35++;
			}
		}
		
		System.out.print("Array de idades:");
		for(int elem : idades){
			System.out.print(elem + " ");
		}
		System.out.println();
		
		System.out.println("Quantidade de pessoas com idade superior a 35 anos: " + qtdMaior35);
	}
}
