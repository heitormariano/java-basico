package com.loiane.cursojava.aula35.labs;

public class Exer01 {

	public static void main(String[] args) {
		
		System.out.println("Imprimindo os 10 primeiros números da série de Fibonacci");
		for(int i = 1; i <= 10; i++){
			System.out.print(Calculadora.fibonacci(i) + " ");
		}
		
	}
}
