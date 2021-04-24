package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer19 {
	private static Scanner scan;

	public static void main(String[] args) {
		double resultado = 0;
		scan = new Scanner(System.in);

		System.out.println("Informe o numero 1:");
		double num1 = scan.nextDouble();
		System.out.println("Informe o numero 2:");
		double num2 = scan.nextDouble();

		System.out.println("Digite a operacao que sera realizada");
		System.out.println("Opcoes: s (soma), sb (subtracao), m (multiplicao), d (divisao)");
		String operacao = scan.next();

		boolean valida = true; // incluindo uma flag

		switch (operacao) {
		case "s":
			resultado = num1 + num2;
			break;
		case "sb":
			resultado = num1 - num2;
			break;
		case "m":
			resultado = num1 * num2;
			break;
		case "d":
			if (num2 == 0) {
				System.out.println("Divisão por zero. A operação não pode ser realizada");
			} else {
				resultado = num1 / num2;
			}
			break;
		default:
			System.out.println("Operação inválida");
			valida = false;
			break;
		}

		if (valida) {
			System.out.println("Resultado da operacao:" + resultado);
			if (resultado >= 0) {
				System.out.println("Numero Positivo");
			} else {
				System.out.println("Numero Negativo");
			}
			if (resultado % 2 == 0) {
				System.out.println("Valor PAR");
			} else {
				System.out.println("Valor IMPAR");
			}
		}
	}
}