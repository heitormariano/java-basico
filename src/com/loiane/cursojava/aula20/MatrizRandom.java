package com.loiane.cursojava.aula20;

import java.text.DecimalFormat;
import java.util.PrimitiveIterator.OfDouble;
import java.util.Random;

public class MatrizRandom {
	public static void main(String[] args) {
		//double[][] notasAlunos = new double[30][4];
		
		
		String padrao = "###,###.##";
		DecimalFormat df = new DecimalFormat(padrao);

		Random random = new Random();
			
		OfDouble iterator = random.doubles(30, 0, 10.01).iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println(iterator.nextDouble());
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println("Valor: " + df.format((Math.random() * 10)));
		}
	}
}
