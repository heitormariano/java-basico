package com.loiane.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setCursos("TADS");
		aluno.setEndereco("Rua 1, número 1");
		aluno.setNotas(new double[] { 10.0, 9.0, 8.0, 7.0 });

		// System.out.println(aluno);
		// impresso (antes de sobrescrever o toString()):
		// com.loiane.cursojava.aula43.Aluno@15db9742
		// 15db9742 = referência de memória (posição de memória)

		System.out.println(aluno);

		// uso de equals
		String texto1 = "abc";
		String texto2 = "abc";

		if (texto1.equals(texto2)) {
			System.out.println("Strings iguais");
		} else {
			System.out.println("Strings diferentes");
		}

		Aluno aluno2 = new Aluno();
		aluno2.setCursos("Redes");
		aluno2.setEndereco("Rua 2, número 2");
		aluno2.setNotas(new double[] { 8.0, 9.0, 7.0, 6.0 });

		if (aluno.equals(aluno2)) {
			System.out.println("Alunos com valores de atributos iguais ");
		} else {
			System.out.println("Alunos com valores de atributos diferentes");
		}
	}
}
