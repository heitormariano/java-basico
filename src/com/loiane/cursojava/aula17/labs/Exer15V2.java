package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer15V2 {
	public static void main(String[] args) {
		// Fibonacci (incluindo o 0): 0, 1, 1,2,3, 5,8, 13, 21 ...
		Scanner scan = new Scanner(System.in);

		int n;
		int primeiro = 0;
		int segundo = 1;
		int proximo;

		System.out.println("Entre com n-ésimo termpo da serie de Fibonacci:");
		n = scan.nextInt();

		//primeiro número é impresso diretamente
		//Se forem, por exemplo, 3 termos da série, será preciso descobir o segundo e terceiro (2 números faltando).
		//Se form, por exemplo, 4 termos da série, será preciso descobrir o segundo, terceiro e quarto (3 números faltando)
		//E assim por diante...
		
		System.out.println(primeiro); 
		for (int i = 0; i < (n - 1) ; i++) { // serão necessárias (n - 1) operações dentro do for 
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.println(proximo);
		}
	}
}
