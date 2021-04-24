package com.loiane.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setNome("Mateus");
		aluno.setTelCelular("(84)98877-4567");
		aluno.setCurso("TADS");
		
		Professor professor = new Professor();
		professor.setNome("Lucas");
		professor.setTelCelular("(84)98855-6776");
		professor.setSalario(2400.00);
		
		// Pessoa é a superclasse de Aluno e Professor
		Pessoa aluno2 = new Aluno();
		aluno2.setEndereco("Rua Teste");
		
		Pessoa professor2 = new Professor();
		professor2.setEndereco("Rua Novo Teste");
		
	}
}
