package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor 1:");
		double valor01 = scan.nextDouble();

		System.out.println("Digite o valor 2:");
		double valor02 = scan.nextDouble();

		if (valor01 > valor02) {
			System.out.println("Valor 1 e maior");
		} else if (valor02 > valor01) {
			System.out.println("Valor 2 e maior");
		} else {
			System.out.println("Os valores sao iguais");
		}
	}
}