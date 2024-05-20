package com.kosta.exam;

public class CharacterIntTest {

	public static void main(String[] args) {
		int data = 65;
		System.out.println(data);
		System.out.println((char)data);
		System.out.println((char)(data+1));
		System.out.println((char)(data+2));
		System.out.println("===============================");
		
		int data2 = 97;
		System.out.println(data2);
		System.out.println((char)data2);
		System.out.println((char)(data2+1));
		System.out.println((char)(data2+2));
		System.out.println("===============================");

		char data3 = 'A';
		System.out.println(data3);
		System.out.println((int)data3);
		System.out.println((data3+1));	
		// int4바이트와 char2바이트를 연산하면 큰 타입인 int로 출력된다.
		
		System.out.println((char)(data3+1));	
		//char와 int를 연산하여 char로 형변환을 해주면 알파벳으로 출력된다.
	}
}
