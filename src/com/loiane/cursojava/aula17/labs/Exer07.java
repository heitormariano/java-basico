package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numero;
		double maior = Double.MIN_VALUE;
		
		for(int i = 0; i < 5; i++){
			System.out.println("Informe um numero:");
			numero = scan.nextDouble();
			if(numero > maior){
				maior = numero;
			}
		}
		
		System.out.println("Maior valor: " + maior);
	}
}
