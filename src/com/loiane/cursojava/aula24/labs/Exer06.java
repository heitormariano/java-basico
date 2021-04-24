package com.loiane.cursojava.aula24.labs;

public class Exer06 {

	public static void main(String[] args) {
		Contato contato1 = new Contato();

		contato1.nome = "Mateus";
		contato1.sobrenome = "Costa";

		contato1.telefones = new String[2];
		contato1.telefones[0] = "98899-8978";
		contato1.telefones[1] = "91234-5656";

		contato1.email = "mcosta@email.com";

		System.out.println("Nome:" + contato1.nome);
		System.out.println("Sobrenome:" + contato1.sobrenome);
		System.out.println("Telefones:");
		System.out.println(contato1.telefones[0]);
		System.out.println(contato1.telefones[1]);
		System.out.println("Email: " + contato1.email);
	}
}
