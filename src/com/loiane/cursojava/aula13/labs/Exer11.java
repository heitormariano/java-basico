package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Escreva um numero inteiro:");
		int valor01 = scan.nextInt();
		System.out.println("Escreva outro numero inteiro:");
		int valor02 = scan.nextInt();
		System.out.println("Escreva um numero real:");
		double valor03 = scan.nextDouble();

		System.out.println("Operacoes executadas:");

		int resp01 = (2 * valor01) * (valor02 / 2);
		double resp02 = (3 * valor01) + valor03;
		double resp03 = Math.pow(valor03,3);

		System.out.println("a) produto do dobro do primeiro com a metade do segundo: " + resp01);
		System.out.println("b) soma do triplo do primeiro com o terceiro: " + resp02);
		System.out.println("c) Terceiro elevado ao cubo: " + resp03);
	}
}