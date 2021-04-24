package com.loiane.cursojava.aula52;

public class UsandoMinhaExceptionV3 {

	public static void main(String[] args) {

		try {
			teste();
		} catch (DivisaoNaoExataException e) {
			System.out.println("Ocorreu uma exception (Divisão não exata)");
			e.printStackTrace();
		}
	}
	
	public static void teste() throws DivisaoNaoExataException{
		int[] nums = { 4, 16, 5, 32, 21, 64, 128 };

		int[] denos = { 2, 0, 4, 8, 16, 2, 0 };

		System.out.println("Antes da Exception");

		for (int i = 0; i < nums.length; i++) {
			try {
				if (nums[i] % 2 != 0) {
					throw new DivisaoNaoExataException(nums[i], denos[i]);
				}
				System.out.println(nums[i] + " / " + denos[i] + " = " + nums[i] / denos[i]);
			} catch (ArithmeticException e) {
				System.out.println("Ocorreu uma exception (divisão por zero)");
				e.printStackTrace();
			}
		}
	}
}
