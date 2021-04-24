package com.loiane.cursojava.aula17.labs;
import java.util.Scanner;

public class Exer20 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int qtdIdades, idade;
		int soma = 0;
		double media;
		String turma = "";

		System.out.println("Quantas pessoas informarão a idade:");
		qtdIdades = scan.nextInt();

		for (int i = 0; i < qtdIdades; i++) {
			System.out.println("Informe a idade " + (i + 1) + " :");
			idade = scan.nextInt();
			soma += idade;
		}
		media = soma / qtdIdades;
		if (media >= 0 && media <= 25) {
			turma = "Jovem";
		} else if (media >= 26 && media <= 60) {
			turma = "Adulta";
		} else if (media > 60) {
			turma = "Idosa";
		}
		System.out.println("A media de idade da turma é " + media + " anos");
		System.out.println("A turma  é " + turma);
	}
}
