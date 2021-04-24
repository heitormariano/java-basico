package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double[] arrayA = new double[20];
		double cotacaoDolar = 0;

		System.out.println("Informe a cotação do Dolar: ");
		cotacaoDolar = scan.nextDouble();
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = cotacaoDolar * (i + 1);
		}

		System.out.println("Tabela de conversões");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("R$ " + (i + 1) + " = " + "U$" + arrayA[i]);
		}
	}
}
