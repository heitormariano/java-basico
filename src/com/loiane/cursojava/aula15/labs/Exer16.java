package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;
import java.lang.Math;

public class Exer16{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Programa para calcular raizes de equacao do segundo grau");

		double a, b, c;

		System.out.println("Coenficientes da equacao do segundo  grau");
		System.out.println("Informe o valor de a:");
		a = scan.nextDouble();
		if(a == 0){
			System.out.println("Valor da 'a' e igual a zero. A equacao nao e do segundo grau");
			//break;
			
		}else{
			System.out.println("Informe o valor de b:");
			b = scan.nextDouble();

			System.out.println("Informe o valor de c:");
			c = scan.nextDouble();

			double delta = Math.pow(b,2) - 4 * (a*c);
			if(delta < 0){
				System.out.println("Delta Menor que 0. A equeacao nao tem raizes reais");
			}else if(delta == 0){
				System.out.println("Delta igual a 0. A equacao tem apenas uma raz");
				double raizUnica = (-b)/2*a;
				System.out.println("Valor da raiz unica: " + raizUnica);
			}else if(delta > 0){
				System.out.println("Delta maior que 0. A equacao tem duas raizes");

				double x1 = (-b + (Math.sqrt(delta))) /2*a;
				double x2 = (-b - (Math.sqrt(delta))) /2*a;

				System.out.println("Valor das raizes: x1 = " + x1 + " - x2 = " + x2);
			}
		}

	}
}