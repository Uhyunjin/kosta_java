package com.kosta.exam01;

public class CharacterAtTest {
	public static void main(String[] args) {
		String data = "hello java";
		System.out.println(data.charAt(0));
		String name = "summer";
		char n = name.charAt(5);
		System.out.println(n);
		
		//int캐스팅은 불가
		String year = "2024";
		int y = year.charAt(0);
		System.out.println(y); //아스키코드값 출력
		int y2 = (int)year.charAt(0);
		System.out.println(y2);
		int y3 = Integer.parseInt(year.charAt(0)+"");
		//문자열을 숫자로 만들어주기 때문에 char는 캐릭터라서 문자열로 변경
		//데이터라도 문자열로 만드는 가장 쉬운 방법은 뒤에 ""를 붙이는것
		System.out.println(y3);
	}
}
