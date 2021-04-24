package com.loiane.cursojava.aula24.labs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exer04 {

	public static void main(String[] args) throws ParseException {
		LivroBiblioteca livro = new LivroBiblioteca();

		livro.titulo = "Super Python";
		livro.autor = "Autor Teste";
		livro.genero = "Programação";
		livro.pessoaEmprestimo = "Heitor Mariano";

		livro.dataEmprestimo = Calendar.getInstance();
		livro.dataEmprestimo.set(Calendar.YEAR, 2017);
		livro.dataEmprestimo.set(Calendar.MONTH, Calendar.MARCH);
		livro.dataEmprestimo.set(Calendar.DAY_OF_MONTH, 15);

		livro.dataDevolucao = Calendar.getInstance();
		livro.dataDevolucao.set(Calendar.YEAR, 2017);
		livro.dataDevolucao.set(Calendar.MONTH, Calendar.MARCH);
		livro.dataDevolucao.set(Calendar.DAY_OF_MONTH, 20);

		String pattern = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		System.out.println("Título: " + livro.titulo);
		System.out.println("Autor: " + livro.autor);
		System.out.println("Genero: " + livro.genero);
		System.out.println("Emprestado para: " + livro.pessoaEmprestimo);

		System.out.println("Data entrega: " + sdf.format(livro.dataEmprestimo.getTime()));
		System.out.println("data devolução: " + sdf.format(livro.dataDevolucao.getTime()));

	}
}
