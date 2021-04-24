package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean valido = false;
		String login;
		String senha;

		do {
			System.out.println("Informe o nome de usuario(login):");
			login = scan.next();
			System.out.println("Informe a senha:");
			senha = scan.next();

			if (login.equalsIgnoreCase(senha)) {
				System.out.println("Login igual a senha. Digite os dados novamente");
			} else {
				valido = true;
				System.out.println("Login e senha validos. Obrigado.");
			}

		} while (!valido);

	}

}
