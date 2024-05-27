package com.kosta.exam01;

import java.util.Scanner;

public class EmailCheck {
//사용자로부터 이메일을 입력받아서 올바른 이메일 형식인지 판별
	public static void main(String[] args) {
		String regex = "[0-9a-zA-Z]+@[0-9a-zA-Z]+\\.com";
//		Scanner sc = new Scanner(System.in);
		String email = "tiger123@gmail.com";
		
		if (email.matches(regex)==true) {
			System.out.println("올바른 이메일");
		}else {
			System.out.println("올바르지 않은 이메일");
		}
	}
}