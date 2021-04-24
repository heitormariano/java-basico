package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculos para um funcionario");
		System.out.println("Informe o valor da hora de trabalho:");
		double valorHora = scan.nextDouble();
		System.out.println("Informe as horas trabalhadas no mes:");
		int horasTrab = scan.nextInt();
		
		double salarioBruto = valorHora * horasTrab;
		
		double impostoRenda = salarioBruto * 0.11;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double totalDescontos = impostoRenda + inss + sindicato;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salario bruto: " + salarioBruto);
		System.out.println("Valor imposto de renda: " + impostoRenda);
		System.out.println("INSS: " + inss);
		System.out.println("Contribuicao sindicato: " + sindicato);
		System.out.println("Total descontos: " + totalDescontos);
		System.out.println("Salario liquido: " + salarioLiquido);
		
	}
}
