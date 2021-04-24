package com.loiane.cursojava.aula46.labs.exer01;

public class Piramide extends Figura3D {

	private double altura;
	private double apotema;
	private double arestaBase;
	private int numLadosPoliBase;

	private Figura2D base;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public int getNumLadosPoliBase() {
		return numLadosPoliBase;
	}

	public void setNumLadosPoliBase(int numLadosPoliBase) {
		this.numLadosPoliBase = numLadosPoliBase;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		double area = calcularAreaBase() + calcularAreaLateral();
		return area;
	}

	private double calcularAreaBase() {
		if (base != null) {
			return base.calcularArea();
		}

		return 0;
	}

	private double calcularAreaLateral() {
		double areaLateral = numLadosPoliBase * ((arestaBase * apotema) / 2);
		return areaLateral;
	}

	@Override
	public double calcularVolume() {
		if (base != null) {
			double volume = (base.calcularArea() * altura) / 3;
			return volume;
		}

		return 0;
	}
}
