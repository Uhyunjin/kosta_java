package com.kosta.exam;

import java.util.Scanner;

// 사용자한테 두 개의 정수를 입력받아 더하기 하여 결과 출력

public class AddTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 1 입력 : ");
		int number1 = sc.nextInt();
		System.out.println("숫자 2 입력 : ");
		int number2 = sc.nextInt();
		
		int add = number1 + number2;
		System.out.println(add);
	}

}
