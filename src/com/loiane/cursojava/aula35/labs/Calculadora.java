package com.loiane.cursojava.aula35.labs;

public class Calculadora {

	public static int fibonacci(int num) {
		// considerando 0 como primeiro número da série e 1 como o segundo
		if (num == 1) {
			return 0;
		} else if (num == 2) {
			return 1;
		}

		return fibonacci(num - 1) + fibonacci(num - 2);
	}

	// Método para realizar somatórios como:
	// Somatório (4) = 4 + 3 + 2 + 1 = 4 + Somatorio(3) = 10
	// Somatório (3) = 3 + 2 + 1 = 6
	public static int somatorio(int num) {
		if (num == 1) {
			return 1;
		}

		return num + somatorio(num - 1);
	}

	// Multiplicação usando somas sucessivas
	// Ex: 4 * 3 = 4 + 4 + 4 = 4 + (4 * 2) = 12
	// Ex: 4 * 2 = 4 + 4 = 4 + (4 * 1) = 8
	// Ex: 4 * 1 = 4
	public static int multiplicar(int num1, int num2) {
		if (num2 == 1) {
			return num1;
		}
		return num1 + multiplicar(num1, num2 - 1);
	}
}
