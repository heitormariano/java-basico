package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite as 4 notas do aluno:");
		System.out.println("Nota 1: ");
		double nota01 = scan.nextDouble();

		System.out.println("Nota 2: ");
		double nota02 = scan.nextDouble();

		System.out.println("Nota 3: ");
		double nota03 = scan.nextDouble();

		System.out.println("Nota 4: ");
		double nota04 = scan.nextDouble();

		double media = (nota01 + nota02 + nota03 + nota04) / 4;

		System.out.println("A media do aluno: " + media);

	}
}
