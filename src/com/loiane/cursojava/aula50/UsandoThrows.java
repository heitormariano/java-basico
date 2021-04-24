package com.loiane.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		System.out.println("Entre com um n�mero decimal:");
		try {
			double num = lerNumero();
			System.out.println("N�mero informado: " + num);
		} catch (Exception e) {
			System.out.println("Entrada Inv�lida");
			e.printStackTrace();
		}

	}

	public static double lerNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double numero = scan.nextDouble();
		return numero;
	}
}
