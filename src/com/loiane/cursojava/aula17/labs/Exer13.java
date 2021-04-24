package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int resultado = 0;
		int base;
		int expoente;

		System.out.println("Programa Potencia");
		System.out.println("Informe a base da potencia:");
		base = scan.nextInt();

		boolean valido = false;
		do {
			System.out.println("informe o expoente da potencia:");
			expoente = scan.nextInt();
			if (expoente > 0) {
				valido = true;
				//solucao com menos linhas de codigo
				resultado = base;
				for (int i = 1; i < expoente; i++) {
					resultado *= base;
				}
				//outra forma de calcular a potencia (mais linhas de codigo)
				/*int aux = base;
				for (int i = 1; i < expoente; i++) {
					base *= aux;
				}
				resultado = base;*/
			} else if (expoente == 0) {
				valido = true;
				resultado = 1;
			} else {
				System.out.println("Para este programa o expoente deve ser igual ou maior que 0. Digite novamente.");
			}
		} while (!valido);
		System.out.println("resultado da potencia: " + resultado);
	}
}
