package com.kosta.exam01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 사용자로부터 주민등록번호를 입력받아서 올바른 주민등록번호인지 판별하는 프로그램 작성
 <<처리조건>>
 ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
 */
public class CheckJunim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력해주세요");
		String number = sc.next();
		
		//형식이 맞는지 판별 먼저 해준다.
		//"-" 하이픈을 기준으로 앞6 뒤7
//		String regex = "[0-9]{6}-[0-9]{7}";
		String regex = "\\d{6}-\\d{7}";
		
		boolean flag = true;
		
		if(number.matches(regex)!=true){
			System.out.println("올바른 주민번호가 아닙니다.");
		}
		
		//곱해줄 숫자를 배열로 만든다
		int []data = {2,3,4,5,6,7,8,9,2,3,4,5};
		
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.size(); i++) {
			if (i==6) {				
				continue;
			}
			arr.add(Integer.parseInt(number.charAt(i)+""));
		}
		
		int res=0;
		
		
		//배열의 숫자와 하나씩 곱해서 결과 변수에 담기
		for (int i = 0; i < data.length; i++) {
			res += data[i] * arr.get(i);
		}
		
		int check=arr.get(12);
		
		res = (11-(res%11))%10;

		System.out.println(check);
		System.out.println(res);
									 
	}

}
