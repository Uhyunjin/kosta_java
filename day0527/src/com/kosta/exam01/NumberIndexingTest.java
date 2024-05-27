package com.kosta.exam01;

import java.util.Date;
import java.util.Scanner;

//주민등록번호를 받아서 나이와 성별 판별하기
public class NumberIndexingTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력해주세요");
		String no = sc.next();
		
		int year = Integer.parseInt(no.substring(0,2));
		int thisYear = (new Date()).getYear();
		int age;
		int gender = Integer.parseInt(no.charAt(7)+"");
		String gender2="";
		
		if (gender<3) {
			age = thisYear-year;

		}else {
			age = thisYear-year;
			
		}
		
		switch (gender) {
		case 1:
		case 3: gender2 = "남";break;
		case 2:
		case 4: gender2 = "여";break;
		}
		
		System.out.println("성별 : "+gender2);
		System.out.println("나이 : "+age);
}}
