package com.loiane.cursojava.aula17.labs;
import java.util.Scanner;

public class Exer27 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;

		double temp;
		int qtdTemp = 0;
		double soma = 0;
		double media;

		boolean valido = false;
		char opcao;
		
		do {
			System.out.println("Deseja Informar Temperaturas?");
			System.out.println("(Obs.: 's' - SIM 'n' - NÃO)");
			opcao = scan.next().charAt(0);
			if (opcao == 's') {
				System.out.println("Quantas temperaturas?");
				qtdTemp = scan.nextInt();
				for (int i = 0; i < qtdTemp; i++) {
					System.out.println("Informe a temperatura " + (i + 1) + " : ");
					temp = scan.nextDouble();

					if (temp > maior) {
						maior = temp;
					}
					if (temp < menor) {
						menor = temp;
					}
					soma += temp;
				}
				media = soma / qtdTemp;
				System.out.println("A menor temperatura: " + menor);
				System.out.println("A maior temperatura: " + maior);
				System.out.println("A media das temperatura é: " + media);

			} else if(opcao == 'n') {
				valido = true;
				System.out.println("Fim execução");
			}
		} while (!valido);
	}
}
