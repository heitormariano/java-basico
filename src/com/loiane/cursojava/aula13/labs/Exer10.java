package com.loiane.cursojava.aula13.labs;


import java.util.Scanner;

public class Exer10{

	public static void main(String[] args){

		//formulas 
		//C = (F-32)/9 * 5
		//F = ((C*9)/5) + 32 ou F = (C * 1.8) + 32

		Scanner scan = new Scanner(System.in);
		System.out.println("Programa para conversao [Celsius para Fahrenheit] ");
		System.out.println("Informe a temperatura em graus Celsius (C) ");
		double grausC = scan.nextDouble();

		double grausF = (grausC * 9)/5 + 32;

		System.out.println(grausC + " C equivale a " + grausF + " F");
	}
}