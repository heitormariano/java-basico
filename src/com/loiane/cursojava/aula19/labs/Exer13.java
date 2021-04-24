package com.loiane.cursojava.aula19.labs;
import java.util.Scanner;

public class Exer13 {
	public static void main(String[] args) {
		int[] arrayA = new int[10];
		int somaMult = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("informe o elemento " + i + " :");
			arrayA[i] = scan.nextInt();
			if (arrayA[i] % 5 == 0) {
				somaMult += arrayA[i];
			}
		}
		
		//brincando com foreach
		System.out.print("Array 5 = ");
		for(int elem : arrayA){
			System.out.print(elem + " ");
		}
		
		System.out.println();
		System.out.println("Soma elementos divisíveis por 5: " + somaMult);
	}
}
