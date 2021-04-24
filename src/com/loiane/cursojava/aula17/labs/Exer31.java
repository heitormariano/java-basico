package com.loiane.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer31 {
	private static Scanner scan = new Scanner(System.in);
	
	private static final int ANO_INICIAL = 1995;
	private static final int ANO_FINAL = 2016;
	private static final double SALARIO_INICIAL = 1_000.00;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		String padrao = "###,###.##";//formato americano (A saída do programa parece estar no formato brasileiro)
		DecimalFormat format = new DecimalFormat(padrao); 
		
		double aumento = 0.015;
		double salarioAtual = SALARIO_INICIAL; //1995 --> sem aumento
		System.out.println("1995 - Percentual: 0 % - Salário: " + format.format(salarioAtual));
		salarioAtual+=salarioAtual * aumento; //1996 --> primeiro ano com aumento;
		System.out.println("1996 - Percentual: 1,5 % - Salário: " + format.format(salarioAtual));
		
		for (int i = (ANO_INICIAL + 2); i <= ANO_FINAL; i++) { // (ANO_INICIAL + 2) = 1997 (ano que o percentual começou a dobrar)
			aumento*=2;
			salarioAtual+=salarioAtual * aumento;
			System.out.println( i  + " - Porcentual: " + format.format(aumento * 100) + " % - Salário: " + format.format(salarioAtual));
		}
	}
}
