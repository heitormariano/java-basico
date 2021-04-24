package com.loiane.cursojava.praticas;

import java.util.Scanner;

public class Calculadora {

	enum Operacao {
		SOMA {
			@Override
			double operacao(double num01, double num02) {
				return num01 + num02;
			}
		},
		SUBTRACAO {
			@Override
			double operacao(double num01, double num02) {
				return num01 - num02;
			}
		},
		MULTIPLICACAO {
			@Override
			double operacao(double num01, double num02) {
				return num01 * num02;
			}
		},
		DIVISAO {
			@Override
			double operacao(double num01, double num02) {
				double retorno = 0;
				if (num02 != 0) {
					retorno = num01 / num02;
				} else {
					try {
						throw new Exception("Não é possível realizar uma divisão por zero");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				return retorno;
			}
		};
		
		abstract double operacao(double num01, double num02);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		double num01 = 0;
		double num02 = 0;

		System.out.println("Escolha uma das opções:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");

		opcao = scan.nextInt();
		System.out.println("Informe o primeiro número: ");
		num01 = scan.nextDouble();
		System.out.println("Informe o segundo número: ");
		num02 = scan.nextDouble();

		switch (opcao) {
		case 1:
			System.out.println("Resultado: " + Operacao.SOMA.operacao(num01, num02));
			break;
		case 2:
			System.out.println("Resultado: " + Operacao.SUBTRACAO.operacao(num01, num02));
			break;
		case 3:
			System.out.println("Resultado: " + Operacao.MULTIPLICACAO.operacao(num01, num02));
			break;
		case 4:
			System.out.println("Resultado: " + Operacao.DIVISAO.operacao(num01, num02));
			break;
		default:
			System.out.println("Não foi informado uma opação válida");
			break;
		}
	}
}
