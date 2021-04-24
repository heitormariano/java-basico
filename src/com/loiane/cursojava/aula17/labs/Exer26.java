package com.loiane.cursojava.aula17.labs;
import java.util.Scanner;

public class Exer26 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int fatorial;
		int numero;
		
		String output = "";
		
		System.out.println("Forneça o número para o fatorial");
		numero = scan.nextInt();
		
		fatorial = 1;
		output += numero + "! = ";
		for (int i = numero; i > 0; i--) {
			if (i != 1) {
				output += i + " . ";
				fatorial *= i;
			} else {
				output += i;
				//fatorial*=i;// pode excluir esta linha, pois o valor parcial do fatorial será multiplicado por 1 (valor de fatorial não mudará)
			}
		}
		System.out.println("Fatoria de:  " + numero);
		output += " = " + fatorial;
		System.out.println(output);
	}
}
