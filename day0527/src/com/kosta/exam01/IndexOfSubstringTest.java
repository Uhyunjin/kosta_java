package com.kosta.exam01;

import java.util.Scanner;

//어떤 사람의 이메일을 입력받아서
//아이디만 추출하여 출력하는 프로그램을 작성해봅시다.
public class IndexOfSubstringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일을 입력해주세요");
		String email = sc.next();
		String id = email.substring(0,email.indexOf("@"));
		System.out.println(id);
	}
}
