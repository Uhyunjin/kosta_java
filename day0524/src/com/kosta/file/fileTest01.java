package com.kosta.file;

import java.util.Scanner;

//어떤 사람의 이름, 주소, 전화를 입력받아서 출력하는 프로그램을 작성
public class fileTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, addr, phone;
		
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("주소 : ");
		addr = sc.next();
		System.out.println("전화번호 : ");
		phone = sc.next();
		
		System.out.println(name+addr+phone);
		
	}

}
