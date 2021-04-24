package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer07{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero:");
		double valor01 = scan.nextDouble();

		System.out.println("Digite o segundo numero:");
		double valor02 = scan.nextDouble();

		System.out.println("Digite o terceiro numero:");
		double valor03 = scan.nextDouble();

		double maior = valor01;
		double menor = valor01;

		if(maior < valor02){
			maior = valor02;
		}
		if(maior < valor03){
			maior = valor03;
		}

		if(menor > valor02){
			menor = valor02;
		}
		if(menor > valor03){
			menor = valor03;
		}

		System.out.println("O maior: " + maior);
		System.out.println("O menor: " + menor);
	}
}