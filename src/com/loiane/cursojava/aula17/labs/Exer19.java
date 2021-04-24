package com.loiane.cursojava.aula17.labs;
import java.util.Scanner;

public class Exer19 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int qtdNotas;
		double nota;
		double soma = 0;
		double media;
		
		
		System.out.println("Informe a quantidade de notas");
		qtdNotas = scan.nextInt();
		
		for(int i = 0 ; i < qtdNotas ; i ++){
			System.out.println("Informe a Nota " + (i + 1));
			nota = scan.nextDouble();
			soma += nota;
		}
		
		media = soma/qtdNotas;
		System.out.println("A soma das notas: " + soma);
		System.out.println("A media das notas: " + media);
	}
}
