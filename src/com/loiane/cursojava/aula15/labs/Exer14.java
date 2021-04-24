package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer14 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Programa Notas Aluno");

		System.out.println("Digite a nota 1:");
		double nota01 = scan.nextDouble();

		System.out.println("Digite a nota 2:");
		double nota02 = scan.nextDouble();

		double media = (nota01 + nota02) / 2;

		String situacao = "";
		String conceito = "";

		if(media >= 9 && media <= 10){
			situacao = "Aprovado";
			conceito = "A";

		}else if (media >= 7.5 && media < 9){
			situacao = "Aprovado";
			conceito = "B";

		}else if (media >= 6 && media < 7.5){
			situacao = "Aprovado";
			conceito = "C";

		}else if (media >= 4 && media < 6){
			situacao = "Reprovado";
			conceito = "D";

		}else if (media >= 0 && media < 4){
			situacao = "Reprovado";
			conceito = "E";
		}

		System.out.println("Informacoes do aluno:");
		System.out.println("Nota 1: " + nota01);
		System.out.println("Nota 2: " + nota02);
		System.out.println("Media: " + media);
		System.out.println("Conceito: " + conceito); 
		System.out.println("Situacao: " + situacao);

	}
}