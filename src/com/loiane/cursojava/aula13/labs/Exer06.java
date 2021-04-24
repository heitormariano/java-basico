package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio (cm) do circulo :");
		double raio = scan.nextDouble();
		double areaCirc = Math.PI * Math.pow(raio, 2);
		System.out.println("A area do circulo: " + areaCirc);
	}
}
