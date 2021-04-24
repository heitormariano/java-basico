package com.loiane.cursojava.aula42;

public class Teste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.setEndereco("Rua 1, numero 1");

		Aluno aluno = new Aluno();
		aluno.setEndereco("Rua 2, numero 2");

		Professor professor = new Professor();
		professor.setEndereco("Rua 3, numero 3");

		pessoa.imprimirEtiquetaEndereco();
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();

	}
}
