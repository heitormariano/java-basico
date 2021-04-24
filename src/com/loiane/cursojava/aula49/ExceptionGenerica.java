package com.loiane.cursojava.aula49;

public class ExceptionGenerica {

	public static void main(String[] args) {
		int[] nums = { 4, 16, 32, 64, 128, 256 };

		int[] denos = { 2, 0, 4, 8, 0 };

		System.out.println("Antes da Exception");

		for (int i = 0; i < nums.length; i++) {
			try {
				System.out.println(nums[i] + " / " + denos[i] + " = " + nums[i] / denos[i]);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
