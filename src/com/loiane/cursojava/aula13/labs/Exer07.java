package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o lado do quadrado: ");
		double lado = scan.nextDouble();
		double areaQuad = Math.pow(lado, 2);
		System.out.println("A area do quadrado: " + areaQuad + " cm");
		System.out.println("O dobro do valor da area: " + (areaQuad * 2) + " cm");
	}
}
