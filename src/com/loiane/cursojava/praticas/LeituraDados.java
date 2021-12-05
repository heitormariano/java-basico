package com.loiane.cursojava.praticas;

import java.util.Scanner;

public class LeituraDados {

	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("informe os seguintes dados:");
		System.out.println("Nome, idade e altura (use vírgula como separador)");
		
		String nome = scan.nextLine();
		int idade = scan.nextInt();
		float altura = scan.nextFloat();
		
		System.out.println("Dados recuperados:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
	}
}
