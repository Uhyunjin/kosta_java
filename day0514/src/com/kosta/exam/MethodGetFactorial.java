package com.kosta.exam;

public class MethodGetFactorial {

	public static int factorial(int number) {
		int res = 1;
		for (int i = 1; i <= number; i++) {
			res *= i;
		}
		return res;
	}
	public static void main(String[] args) {
		int a = factorial(3);
		System.out.println(a);
	}
}
