package com.kosta.exam;

public class MatrixTest {

	public static void main(String[] args) {
		int [][]a = new int[4][3];
		
		int n = 1;
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] : ", i);
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = n;
				n++;
				System.out.printf("[%3d]",a[i][j]);
			}
			System.out.println();
		}
	}
}
