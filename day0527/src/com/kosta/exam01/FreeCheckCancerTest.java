package com.kosta.exam01;

import java.util.Date;
import java.util.Scanner;

//사용자로부터 주민번호를 입력받아
//무료암검진 대상자인지 판별하는 프로그램 작성
//
public class FreeCheckCancerTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력해주세요");
		String number = sc.next();
		
		int year = Integer.parseInt(number.substring(0,2));
		int thisYear = (new Date()).getYear();
		int age;
		int gender = Integer.parseInt(number.charAt(7)+"");
		String gender2="";
		String type = "위암 간암 일반암";

		//주민등록번호 검증공식
		
		
		//나이 판별
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
		
		boolean flag = thisYear%2==year%2 && age>=40;
		
		if (flag) {
			if (age<50) {
				if (gender2.equals("남")) {
					
				}else {
					type += " 자궁암 유방암";
				}
			}else {
				if (gender2.equals("남")) {
					type += " 대장암";
				}else {
					type += " 대장암 자궁암 유방암";
				}
			}
			System.out.println("대상자입니다.");
			System.out.println(type);
		}else{
			System.out.println("대상자가 아닙니다.");
		}
		//end if
		System.out.println(flag);
	}// end main	
}
