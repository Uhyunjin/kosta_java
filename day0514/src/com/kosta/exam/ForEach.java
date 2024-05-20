package com.kosta.exam;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		double[] readings;
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 정해주세요 : ");
		int i = sc.nextInt();
		readings = new double[i];
		
		System.out.println(readings.length);
	}

}
