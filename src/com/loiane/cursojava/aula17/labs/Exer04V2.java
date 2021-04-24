package com.loiane.cursojava.aula17.labs;

public class Exer04V2 {
	public static void main(String[] args) {
		double popA = 80_000;
		double taxaPopA = 0.03;

		double popB = 200_000;
		double taxaPopB = 0.015;

		int count = 0;

		//uso apenas do while
		while (popA < popB) {
			popA += popA * taxaPopA;
			popB += popB * taxaPopB;
			count++;
		}
		
		System.out.println("Populacao A = " + popA);
		System.out.println("Populacao B = " + popB);
		System.out.println("Quantidade de anos: " + count);
	}

}
