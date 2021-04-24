package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer02{
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um numero inteiro:");
		int numero = scanner.nextInt();
		
		System.out.println("O numero digitado foi: " + numero);
	}
}