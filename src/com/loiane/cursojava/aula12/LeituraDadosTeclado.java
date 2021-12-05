package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//Leitura de v�rios dados
		System.out.println("Digite as seguintes informa��es:");
		System.out.println("(a)Nome ");
		System.out.println("(b)Idade ");
		System.out.println("(c)Altura (use v�rgular como separador) ");
		System.out.println("(d)Quantidade de Filhos ");
		System.out.println("(e)� casado? (true ou false)");
		
		String nome = scanner.next();
		int idade = scanner.nextInt();
		float altura = scanner.nextFloat();
		byte qtdFilhos = scanner.nextByte();
		boolean temConjuge = scanner.nextBoolean();
		
		System.out.println("Os dados fornecidos foram:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("� casado? " + temConjuge);
	}

}

