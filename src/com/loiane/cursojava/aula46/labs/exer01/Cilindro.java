package com.loiane.cursojava.aula46.labs.exer01;

public class Cilindro extends Figura3D {

	private double raio;
	private double altura;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularVolume() {
		double volume = Math.PI * (Math.pow(raio, 2)) * altura;
		return volume;

	}

	@Override
	public double calcularArea() {
		double area = (2 * calcularAreaBase()) + calcularAreaLateral();
		return area;

	}

	private double calcularAreaBase() {
		double areaBase = Math.PI * Math.pow(raio, 2);
		return areaBase;
	}

	private double calcularAreaLateral() {
		double areaLateral = (2 * Math.PI * raio) * altura;
		return areaLateral;
	}

}
