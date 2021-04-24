package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do produto 1:");
		double valor01 = scan.nextDouble();

		System.out.println("Digiteo o valor do produto 2:");
		double valor02 = scan.nextDouble();

		System.out.println("Digiteo o valor do produto 3:");
		double valor03 = scan.nextDouble();

		
		if(valor01 <= valor02 &&  valor01 <= valor03){
			System.out.println("Compre o produto 1 - valor: " + valor01);
		}else if(valor02 <= valor01 && valor02 <= valor03){
			System.out.println("Compre o produto 2 - valor: " + valor02);
		}else if(valor03 <= valor01 && valor03 <= valor02){
			System.out.println("Compre o produto 3 - valor: " + valor03);
		}

	}	
}