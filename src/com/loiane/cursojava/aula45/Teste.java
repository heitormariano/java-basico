package com.loiane.cursojava.aula45;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Pessoa alunoPessoa = aluno; //upcasting
		
		Pessoa aluno2 = (Pessoa) new Aluno(); //upcasting
		
		Pessoa aluno3 = new Pessoa();
		Aluno aluno4 = (Aluno) aluno3; // downcasting (ocorre erro de conversão na execução)
	}
}
