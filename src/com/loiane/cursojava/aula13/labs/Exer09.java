package com.loiane.cursojava.aula13.labs;


import java.util.Scanner;


public class Exer09{
	public static void main(String[] args){

		//formulas 
		//C = (F-32)/9 * 5
		//F = ((C*9)/5) + 32 ou F = (C * 1.8) + 32

		Scanner scan = new Scanner(System.in);
		System.out.println("Programa para conversao [Fahrenheit para Celsius] ");
		System.out.println("Informe a temperatura em graus Fahrenheit (F) ");
		double grausF = scan.nextDouble();

		double grausC = (grausF - 32)/9 * 5;

		System.out.println(grausF + " F equivale a " + grausC + " C");
	}
}