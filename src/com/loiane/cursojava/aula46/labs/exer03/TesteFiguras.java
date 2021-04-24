package com.loiane.cursojava.aula46.labs.exer03;

import com.loiane.cursojava.aula46.labs.exer01.Cilindro;
import com.loiane.cursojava.aula46.labs.exer01.Circulo;
import com.loiane.cursojava.aula46.labs.exer01.Cubo;
import com.loiane.cursojava.aula46.labs.exer01.Figura2D;
import com.loiane.cursojava.aula46.labs.exer01.Figura3D;
import com.loiane.cursojava.aula46.labs.exer01.FiguraGeometrica;
import com.loiane.cursojava.aula46.labs.exer01.Piramide;
import com.loiane.cursojava.aula46.labs.exer01.Quadrado;
import com.loiane.cursojava.aula46.labs.exer01.Triangulo;

public class TesteFiguras {

	public static void main(String[] args) {

		Quadrado quadrado1 = new Quadrado();
		quadrado1.setNome("Quadrado");
		quadrado1.setLado(4);

		Triangulo triangulo1 = new Triangulo();
		triangulo1.setNome("Triangulo");
		triangulo1.setBase(4);
		triangulo1.setAltura(6);

		Circulo circulo1 = new Circulo();
		circulo1.setNome("Circulo");
		circulo1.setRaio(5);

		Cubo cubo1 = new Cubo();
		cubo1.setNome("Cubo");
		cubo1.setLado(4);

		Cilindro cilindro1 = new Cilindro();
		cilindro1.setNome("Cilindro");
		cilindro1.setRaio(2);
		cilindro1.setAltura(6.5);

		Piramide piramide1 = new Piramide();
		piramide1.setNome("Piramide");
		piramide1.setAltura(4.4);
		piramide1.setApotema(6.2);

		piramide1.setArestaBase(3);
		piramide1.setNumLadosPoliBase(3);

		Triangulo basePiramide1 = new Triangulo();
		basePiramide1.setNome("Triangulo da base da Piramide");
		basePiramide1.setAltura(5.4);
		basePiramide1.setBase(3);

		piramide1.setBase(basePiramide1);

		FiguraGeometrica[] figuras = new FiguraGeometrica[6];

		figuras[0] = quadrado1;
		figuras[1] = triangulo1;
		figuras[2] = circulo1;

		figuras[3] = cubo1;
		figuras[4] = cilindro1;
		figuras[5] = piramide1;

		System.out.println("Figuras Geométricas");
		System.out.println("---------------------------------");
		for (FiguraGeometrica figura : figuras) {
			System.out.println("Nome: " + figura.getNome());
			if (figura instanceof Figura2D) {
				Figura2D figura2d = (Figura2D) figura;
				System.out.println("Área: " + figura2d.calcularArea());
				System.out.println();

			} else if (figura instanceof Figura3D) {
				Figura3D figura3d = (Figura3D) figura;
				System.out.println("Área: " + figura3d.calcularArea());
				System.out.println("Volume: " + figura3d.calcularVolume());
				System.out.println();
			}
		}
		System.out.println("---------------------------------");

	}
}
