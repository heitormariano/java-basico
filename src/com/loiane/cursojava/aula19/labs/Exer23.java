package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		int[] arrayA = new int[10];

		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("informe o elemento " + i + ": ");
			arrayA[i] = scan.nextInt();
		}
		
		System.out.print("Array A = ");
		for(int i = 0; i < arrayA.length; i ++){	
			if(arrayA[i] % 2 != 0 ){
				System.out.println();
				System.out.println("Existe, pelo menos, um elemento ímpar. Programa interrompido");
				break;
			}else{
				System.out.print(arrayA[i] + " ");
			}
		}
	}
}
