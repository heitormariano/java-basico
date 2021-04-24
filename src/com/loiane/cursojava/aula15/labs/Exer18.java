package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer18{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero:");
		int numero = scan.nextInt();

		if(numero % 2 == 0){
			System.out.println("O numero " + numero + " e PAR");
		}else{
			System.out.println("O numero " + numero + " e IMPAR");
		}
	}
}