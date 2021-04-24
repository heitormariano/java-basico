package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer15 {
	public static void main(String[] args) {
		// 0, 1, 1,2,3, 5,8, 13, 21 ...
		Scanner scan = new Scanner(System.in);

		int qtdTermos;
		int ant = 0;
		int pos = 1;

		System.out.println("Quantos termos a serie de Fibonacci tera?");
		qtdTermos = scan.nextInt();

		System.out.println(ant);
		for (int i = 0; i < (qtdTermos - 1); i++) {
			System.out.println(pos);
			pos = ant + pos;
			ant = pos - ant;
		}
	}
}
