package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer17V2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;

		System.out.println("nforme o numero:");
		numero = scan.nextInt();

		int faltorial = 1;
		for (int i = numero; i > 0; i--) {
			faltorial *= i;
		}
		System.out.println(numero + "! = " + faltorial);
	}
}
