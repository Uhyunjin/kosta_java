package com.kosta.exam;

import java.util.Scanner;

public class CountLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []count = new int[26];
		// 알파벳 별 개수 누적
		
		System.out.println("문자열을 입력하시오 : ");
		String buffer = sc.nextLine();
		//next는 블랭크를 입력할 수 없지만 nextline은 공백문자도 enter 입력 전까지 입력가능함
		
		//각 문자가 등장하는 회수를 계산한다.
		for(int i=0; i<buffer.length(); i++) {
			char ch = buffer.charAt(i);
			count[ch-'a']++;
			// 배열은 a-a=0 a-b=1 a-c=3...을 이용한 로직
		}
		// 배열에 저장된 횟수를 출력하는 반복 루프
		for(int i=0;i<count.length;i++) {
			System.out.printf("%c ==> %d\n", 'a'+i, count[i]);
		}
	}

}
