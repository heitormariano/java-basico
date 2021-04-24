package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor em metros: ");
		double medidaM = scan.nextDouble();
		double medidaCm = medidaM * 100;
		System.out.println(medidaM + " m equivale a " + medidaCm + " cm");
	}
}
