package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer33V2 {

	public static void main(String[] args) {
		int[] arrayA = new int[10];
		Scanner scan = new Scanner(System.in);

		System.out.println("Array A");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("informe o elemento " + i + " : ");
			arrayA[i] = scan.nextInt();
		}

		boolean primo;
		String msg;

		for (int i = 0; i < arrayA.length; i++) {
			primo = true;
			for (int j = 2; j < arrayA[i]; j++) {
				if (arrayA[i] % j == 0) {
					primo = false;
					break;
				}
			}

			msg = "";
			if (primo) {
				msg = " [Primo]";
			} else {
				msg = " [NÃO é primo]";
			}

			System.out.println(arrayA[i] + msg);
		}

	}
}
