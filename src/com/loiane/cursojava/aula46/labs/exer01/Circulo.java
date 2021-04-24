package com.loiane.cursojava.aula46.labs.exer01;

public class Circulo extends Figura2D {

	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		double area = Math.PI * (Math.pow(this.raio, 2));
		return area;

	}

}
