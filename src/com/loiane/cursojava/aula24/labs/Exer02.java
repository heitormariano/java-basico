package com.loiane.cursojava.aula24.labs;

public class Exer02 {

	public static void main(String[] args) {
		Livro livro = new Livro();

		livro.titulo = "Programa��o Java";
		livro.autor = "Autor Teste";
		livro.edicao = "Edicao Java Show";
		livro.editora = "Editora Estudos True";
		livro.anoPublicacao = 2017;
		livro.numPaginas = 600;

		System.out.println("T�tulo: " + livro.titulo);
		System.out.println("Autor: " + livro.autor);
		System.out.println("Edi��o: " + livro.edicao);
		System.out.println("Editora: " + livro.editora);
		System.out.println("Ano de publica��o: " + livro.anoPublicacao);
		System.out.println("N�mero de p�ginas: " + livro.numPaginas);
	}
}
