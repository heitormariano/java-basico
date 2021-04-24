package com.loiane.cursojava.aula17.labs;
import java.util.Scanner;

public class Exer22 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int qtdCDs;
		double valorCD;
		double soma = 0;
		double valorMedio;

		System.out.println("Informe a quantide de CDs do Colecionador:");
		qtdCDs = scan.nextInt();

		for (int i = 0; i < qtdCDs; i++) {
			System.out.println("Informe o valor do CD " + (i + 1) + " :");
			valorCD = scan.nextDouble();
			soma += valorCD;
		}
		valorMedio = soma / qtdCDs;
		System.out.println("Soma dos valores dos CDs: R$ " + soma);
		System.out.println("Valor médio pago por cada CD: R$ " + valorMedio);
	}
}
