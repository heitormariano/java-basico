package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		int aux;

		System.out.println("informe o numero para o fatorial:");
		numero = scan.nextInt();
		aux = numero;

		for (int i = 1; i < aux; i++) {
			numero *= i;
		}
		System.out.println("Fatorial de " + aux + ": " + numero);
	}
}
