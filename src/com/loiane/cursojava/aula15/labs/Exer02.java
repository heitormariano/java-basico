package com.loiane.cursojava.aula15.labs;


import java.util.Scanner;

public class Exer02{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		double numero = scan.nextDouble();

		if(numero == 0){
			System.out.println("O numero e igual a 0");
		}else if(numero > 0){
			System.out.println("O numero e positivo");
		}else{
			System.out.println("O numero e negativo");
		}
	}
}