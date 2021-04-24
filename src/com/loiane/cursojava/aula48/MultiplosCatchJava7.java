package com.loiane.cursojava.aula48;

public class MultiplosCatchJava7 {

	public static void main(String[] args) {

		int[] nums = { 4, 16, 32, 64, 128, 256 };

		int[] denos = { 2, 0, 4, 8, 16 };

		System.out.println("Antes da Exception");

		for (int i = 0; i < nums.length; i++) {
			try {
				System.out.println(nums[i] + " / " + denos[i] + " = " + nums[i] / denos[i]);
			} catch (ArithmeticException | IndexOutOfBoundsException e) {
				System.out.println("Ocorreu uma exception (divisão por zero ou índice inválido)");
			}
		}

	}
}
