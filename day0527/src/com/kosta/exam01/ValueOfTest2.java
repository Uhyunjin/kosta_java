package com.kosta.exam01;

public class ValueOfTest2 {
	public static void main(String[] args) {
		//int 자료형을 String으로 만들기
		int year = 2024;
		String data_year = String.valueOf(year);
		System.out.println(data_year);
		
		double height = 56.7;
		String data_height = String.valueOf(height);
		System.out.println(data_height);
		
		boolean flag = false;
		String data_flag = String.valueOf(flag);
		System.out.println(data_flag);
		
		char []arr = {'h','e','l','l','o'};
		String data_arr = String.valueOf(arr);
		System.out.println(data_arr);
	}
}
