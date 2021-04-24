package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
/*		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número:");
		int num = scan.nextInt();

		System.out.println("informe um limite:");
		int max = scan.nextInt();

		for (int i = num; i <= max; i++) {
			// dSystem.out.println(i);
			if (i % 7 == 0) {
				System.out.println("Primeiro número divisível por 7: " + i);
				break;
			}
		}*/

		/*for (int i=0; i<=4; i++){
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if (i == 1){
							break rotulo1;
						}
						if (i == 2){
							break rotulo2;
						}
						if (i == 3){
							break rotulo3;
						}
						System.out.println("rotulo3");
					}
					System.out.println("rotulo2");
				}
				System.out.println("rotulo1");
			}
			System.out.println(i);
		}*/
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número:");
		int num = scan.nextInt();

		System.out.println("informe um limite:");
		int max = scan.nextInt();

		for (int i = num; i <= max; i++) {
			if (i % 7 == 0) {
				continue;
			}

			System.out.println(i);
		}
	}
	
}
