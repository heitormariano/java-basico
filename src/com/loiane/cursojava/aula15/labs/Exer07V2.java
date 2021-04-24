package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer07V2{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero:");
		double valor01 = scan.nextDouble();

		System.out.println("Digite o segundo numero:");
		double valor02 = scan.nextDouble();

		System.out.println("Digite o terceiro numero:");
		double valor03 = scan.nextDouble();


		//verficacao do maior
		if(valor01 >= valor02 && valor01 >= valor03){
			System.out.println("O valor 1 e maior: " + valor01);
		}else if(valor02 >= valor01 && valor02 >= valor03){
			System.out.println("O valor 2 e maior: " + valor02);
		}else if(valor03 >= valor01 && valor03 >= valor02){
			System.out.println("O valor 3 e maior: " + valor03);
		}

		//verificacao do menor
		if(valor01 <= valor02 &&  valor01 <= valor03){
			System.out.println("O valor 1 e menor: " + valor01);
		}else if(valor02 <= valor01 && valor02 <= valor03){
			System.out.println("O valor 2 e menor: " + valor02);
		}else if(valor03 <= valor01 && valor03 <= valor02){
			System.out.println("O valor 3 e menor: " + valor03);
		}

	}	
}