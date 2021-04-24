package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer15 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Programa Triangulo");

		System.out.println("Digite o lado 1:");
		double lado1 = scan.nextDouble();

		System.out.println("Digite o lado 2:");
		double lado2 = scan.nextDouble();

		System.out.println("Digite o lado 3:");
		double lado3 = scan.nextDouble();

		if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
			System.out.println("Lados fornecidos sao realmente de um triangulo");

			if(lado1 == lado2 && lado1 == lado3){
				System.out.println("Triangulo Equilatero");
			}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
				System.out.println("Triangulo Isosceles");
			}else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
				System.out.println("Triangulo Escaleno");
			}
		}else {
			System.out.println("Lados NAO sao de um triangulo");
		}
	}
}