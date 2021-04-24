package com.loiane.cursojava.aula13.labs;

//package

import java.util.Scanner;


public class Exer03{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe dois numeros");
		System.out.println("Primeiro:");
		int valor01 = scanner.nextInt();
		System.out.println("Segundo:");
		int valor02 = scanner.nextInt();

		System.out.println("A soma dos numeros:" + (valor01 + valor02));

	}
}