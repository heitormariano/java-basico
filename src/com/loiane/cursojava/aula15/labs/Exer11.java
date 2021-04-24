package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Programa calculo de salario");
		System.out.println("Informe o salario:");
		double salarioBase = scan.nextDouble();

		double valorAumento = 0;
		double salarioNovo = 0;
		String porcentualUsado = "";

		if(salarioBase <= 280.00){
			valorAumento = salarioBase * 0.20;
			salarioNovo = salarioBase + valorAumento;
			porcentualUsado = "20%";
		}else if(salarioBase > 280.00 && salarioBase <= 700.00){
			valorAumento = salarioBase * 0.15;
			salarioNovo = salarioBase + valorAumento;
			porcentualUsado = "15%";
		}else if(salarioBase > 700.00 && salarioBase <= 1500.00){
			valorAumento = salarioBase * 0.10;
			salarioNovo = salarioBase + valorAumento;
			porcentualUsado = "10%";
		}else if(salarioBase > 1500.00){
			valorAumento = salarioBase * 0.05;
			salarioNovo = salarioBase + valorAumento;
			porcentualUsado = "5%";
		}

		System.out.println("Resultados obtidos:");
		System.out.println("Salario inicial: " + salarioBase);
		System.out.println("Porcentual aplicado " + porcentualUsado);
		System.out.println("Aumento: " + valorAumento);
		System.out.println("Salario Final: " + salarioNovo);
	}
}