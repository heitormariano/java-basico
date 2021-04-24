package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arrayA = new int[15];
		double[] arrayB = new double[arrayA.length];

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Digite o valor do elemento " + i + " :");
			arrayA[i] = scan.nextInt();

			arrayB[i] = Math.sqrt(arrayA[i]);
		}

		/*for (int i = 0; i < arrayA.length; i++) {
			arrayB[i] = Math.sqrt(arrayA[i]);
		}*/

		System.out.print("Array A = ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}

		String pattern = "###,###.###";
		DecimalFormat df = new DecimalFormat(pattern);

		System.out.println();
		System.out.print("Array B = ");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(df.format(arrayB[i]) + " ");
		}
	}
}
