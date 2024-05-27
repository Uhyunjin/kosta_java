package com.kosta.exam01;

import java.util.Scanner;

//사용자한테 아이디와 암호를 입력받아서
//올바른지 판별하는 프로그램
//아이디 : kosta 암호 : 1234
public class EqualsTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pwd;
		
		System.out.println("아이디 : ");
		id = sc.next();
		System.out.println("암호 : ");
		pwd = sc.next();
		
//		if (id=="kosta" && pwd=="1234") {
		if (id.toLowerCase().equals("kosta") && pwd.equals("1234")) {
//		if (id.equalsIgnoreCase("kosta") && pwd.equals("1234")) {
			System.out.println("어서오세요!");
		}else {
			System.out.println("아이디와 비밀번호를 확인하세요");
		}
	}
}
