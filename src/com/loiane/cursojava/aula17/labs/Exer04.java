package com.loiane.cursojava.aula17.labs;

public class Exer04 {
	public static void main(String[] args) {
		double popA = 80_000;
		double taxaPopA = 0.03;

		double popB = 200_000;
		double taxaPopB = 0.015;

		int count = 0;
		boolean valido = false;

		do {
			if (popA >= popB) {
				valido = true;
			} else {
				popA = popA + popA * taxaPopA;
				popB = popB + popB * taxaPopB;
				count++;
			}
		} while (!valido);
		
		System.out.println("Anos que passaram: " + count);
	}

}
