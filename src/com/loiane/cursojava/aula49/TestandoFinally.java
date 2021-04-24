package com.loiane.cursojava.aula49;

public class TestandoFinally {

	public static void main(String[] args) {
		int[] nums = { 4, 16, 32, 64, 128, 256 };

		int[] denos = { 2, 0, 4, 8, 16 };

		System.out.println("Antes da Exception");

		for (int i = 0; i < nums.length; i++) {
			try {
				System.out.println(nums[i] + " / " + denos[i] + " = " + nums[i] / denos[i]);
			} catch (ArithmeticException e) {
				System.out.println("Erro ao tentar dividir por zero");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Posi��o inv�lida do vetor");
			} finally {
				System.out.println("Esta linha � sempre impressa ap�s um try ou catch");
			}
		}
	}
}
