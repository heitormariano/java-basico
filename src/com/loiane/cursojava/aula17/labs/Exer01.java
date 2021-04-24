package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean infovalido = false;

		do {
			System.out.println("Informe login:");
			String login = scan.next();

			System.out.println("Informe senha:");
			String senha = scan.next();

			if (login.equals(senha)) {
				System.out.println("Login igual a senha. Informe dados válidos");
			} else {
				infovalido = true;
			}
		} while (!infovalido);
		System.out.println("FIM");
	}
}
