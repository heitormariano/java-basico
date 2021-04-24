package com.loiane.cursojava.aula34.labs;

public class Calculadora {

	public static int somar(int num01, int num02) {
		return num01 + num02;
	}

	public static int subtrair(int num01, int num02) {
		return num01 - num02;
	}

	public static int multiplicar(int num01, int num02) {
		return num01 * num02;
	}

	public static int dividir(int num01, int num02) {
		if (num02 != 0) {
			return num01 / num02;
		} else {
			throw new ArithmeticException("N�o � poss�vel realizar a divis�o de um n�mero por zero!");
		}
	}

	public static int elevarPotencia(int base, int expoente) {
		return (int) Math.pow(base, expoente);
	}

	// parte exerc�cio 03
	public static int fatorial(int num) {
		if (num == 0) {
			return 1;
		}

		int faltorial = 1;
		for (int i = num; i > 0; i--) {
			faltorial *= i;
		}

		return faltorial;
	}
}
