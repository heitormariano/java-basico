package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer15V2 {
	public static void main(String[] args) {
		// Fibonacci (incluindo o numero 0): 0, 1, 1,2,3, 5,8, 13, 21 ...
		Scanner scan = new Scanner(System.in);

		int n;
		int primeiro = 0;
		int segundo = 1;
		int proximo;

		System.out.println("Entre com n-esimo termo da serie de Fibonacci:");
		n = scan.nextInt();

		//Primeiro numero impresso diretamente
		//Se forem, por exemplo, 3 termos da  serie, sera preciso descobir o segundo e terceiro (2  numeros faltando).
		//Se form, por exemplo, 4 termos da serie, sera preciso descobrir o segundo, terceiro e quarto (3 numeros faltando)
		//E assim por diante...
		
		System.out.println(primeiro); 
		for (int i = 0; i < (n - 1) ; i++) { // serao necessarias (n - 1) operacoes dentro do for 
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.println(proximo);
		}
	}
}
