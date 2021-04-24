package com.loiane.cursojava.aula52;

public class UsandoMinhaException {

	public static void main(String[] args) {

		int[] nums = { 4, 16, 5, 32, 21, 64, 128 };

		int[] denos = { 2, 0, 4, 8, 16, 2, 0 };

		System.out.println("Antes da Exception");

		for (int i = 0; i < nums.length; i++) {
			try {
				if(nums[i] % 2 != 0){
					throw new Exception("Número ímpar. Divisão não exata");
				}
				System.out.println(nums[i] + " / " + denos[i] + " = " + nums[i] / denos[i]);
			} catch (ArithmeticException e) {
				System.out.println("Ocorreu uma exception (divisão por zero)");
			} catch (Exception e) {
				System.out.println("Aconteceu uma exception");
				System.out.println(e.getMessage());
			}
		}

	}
}
