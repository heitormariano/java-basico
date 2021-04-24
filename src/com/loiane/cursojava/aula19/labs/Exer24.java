package com.loiane.cursojava.aula19.labs;

import java.util.Arrays;
import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		int[] arrayA = new int[10];
		Scanner scan = new Scanner(System.in);
		
		int meio = arrayA.length / 2;
		boolean palindromo = true;

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("informe o elemento " + i + ": ");
			arrayA[i] = scan.nextInt();
		}

		for (int i = 0; i < meio; i++) {
			if (arrayA[i] != arrayA[(arrayA.length - 1) - i]) {
				palindromo = false;
				break;
			}
		}

		String elementos = Arrays.toString(arrayA);
		if (palindromo) {
			System.out.println("A sequ�ncia " + elementos + " � um Pal�ndromo");
		} else {
			System.out.println("A sequ�ncia " + elementos + " N�O � um pal�ndromo");
		}
	}
}
