package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Digite seu nome completo:");

		String nomeCompleto = scanner.nextLine();
		System.out.println("Nome informado: " + nomeCompleto);

		System.out.println("Digite seu primeiro nome:");
		//se for digitado, por exemplo, Heitor Mariano, a linha abaixo irá ler apenas Heitor.
		String primeiroNome = scanner.next();
		System.out.println("Primeiro nome:" + primeiroNome);
		
		System.out.println("Digite a sua idade:");
		int idade = scanner.nextInt();
		System.out.println("Idade informada: " + idade);
		
		System.out.println("Digite a sua altura:");
		double altura = scanner.nextDouble();
		System.out.println("A sua altura é: " + altura); */
		
		//Leitura de vários dados
		System.out.print("Digite as seguintes informações:");
		System.out.print("(a)Nome ");
		System.out.print("(b)Idade ");
		System.out.print("(c)Altura ");
		System.out.print("(d)Quantidade de Filhos ");
		System.out.println("(e)É casado?");
		
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
		System.out.println("É casado?" + temConjuge);
	}

}

