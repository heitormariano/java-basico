package com.loiane.cursojava.aula17.labs;
import java.util.Scanner;

public class Exer28 {
	private static Scanner scan = new Scanner(System.in);

	//Id�ntico ao exerc�cio 18
	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int numero;
		boolean primo = true;

		System.out.println("Algoritmo N�meros Primos - Exerc�cio 28");
		System.out.println();

		System.out.println("Informe um n�mero:");
		numero = scan.nextInt();

		//foram desconsiderados como valores do i o n�mero 1 e o pr�prio n�mero informado
		//Dessa forma, caso o n�mero seja divis�vel por outros n�meros, ele n�o � primo
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				System.out.println("Nao � primo - divis�vel por: " + i);
				primo = false;
				// break;
			}
		}
		if (primo) {
			System.out.println("Numero PRIMO");
		}
	}
}
