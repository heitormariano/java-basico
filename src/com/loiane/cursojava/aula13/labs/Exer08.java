package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;


public class Exer08{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor por hora de trabalho:");
		double valorHora = scan.nextDouble();

		System.out.println("Informe quantidade de horas trabalhas no mes:");
		double qtdHorasMes = scan.nextDouble();

		double total = qtdHorasMes * valorHora;
		System.out.println("O total investido pelas horas de trabalho: R$ " + total);
		
	}
}