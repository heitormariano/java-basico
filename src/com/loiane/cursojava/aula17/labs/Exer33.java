package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer33 {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int qtdElem;

		System.out.println("Informe a quantidade de Elementos:");
		qtdElem = scan.nextInt();

		String output = "S = ";

		for (int i = 1, j = 1; i <= qtdElem; i++, j += 2) {
			if (i != qtdElem) {
				output += i + "/" + j + " + ";
			} else {
				output += i + "/" + j;
			}
		}
		System.out.println(output);
	}
}
