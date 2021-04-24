package com.loiane.cursojava.aula24.labs;

public class Exer03 {

	public static void main(String[] args) {
		LivroLivraria livro = new LivroLivraria();

		livro.titulo = "JSF para iniciantes";
		livro.autor = "Autor Teste";
		livro.preco = 120.10;
		livro.genero = "Programação";

		System.out.println("Título: " + livro.titulo);
		System.out.println("Autor: " + livro.autor);
		System.out.println("Preço: " + livro.preco);
		System.out.println("Genero: " + livro.genero);
	}
}
