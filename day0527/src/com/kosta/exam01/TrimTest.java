package com.kosta.exam01;

public class TrimTest {
	public static void main(String[] args) {
		String data = "  hell o ";
		System.out.println("|"+data+"|");
		String data2 =data.trim();
		System.out.println("|"+data2+"|");
		System.out.println(data2.length());
		//데이터가 변하는 것이 아니라 공백제거한 문자열만 출력해준것
		System.out.println("|"+data+"|");
	}
}
