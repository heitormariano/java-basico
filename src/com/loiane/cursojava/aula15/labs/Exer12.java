package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer12{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Folha de pagamento");
		System.out.println("Informe o valor da hora trabalhada:");
		double valorHora = scan.nextDouble();
		System.out.println("Informe as horas trabalhas no mes:");
		int horasMes = scan.nextInt();

		double salario = valorHora * horasMes;
		double inss = salario * 0.10; //parte do sindicado não foi calculado
		double fgts = salario * 0.11;

		double ir = 0;
		String porcentual = "";
		double salarioLiquido = 0;

		if(salario <= 900.00){
			porcentual = "Insento";			
		}else if(salario > 900.00 && salario <= 1500){
			porcentual = "5%";
			ir = salario * 0.05;
		}else if(salario > 1500 && salario <= 2500){
			porcentual = "10%";
			ir = salario * 0.10;
		}else if(salario > 2500){
			porcentual = "20%";
			ir = salario * 0.20;
		}

		double totalDescontos = ir + inss;
		salarioLiquido = salario - totalDescontos;

		System.out.println("Salario Bruto: ( " + valorHora + " * " + horasMes + " ) : " + salario);
		System.out.println("(-) IR : ( " + porcentual +" ) : " + ir);
		System.out.println("(-) INSS (10%) : " + inss);
		System.out.println("FGTS (11%): " + fgts);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salario Liquido: " + salarioLiquido);
	}
}