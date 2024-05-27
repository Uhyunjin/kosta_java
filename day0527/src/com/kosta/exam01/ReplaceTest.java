package com.kosta.exam01;

public class ReplaceTest {
	public static void main(String[] args) {
		String data = "hello java hello oracle";
		//hello를 hi로 바꾸기
		
		//String data2 = data.replace("hello", "hi");
		String data2 = data.replaceAll("hello", "hi");
		System.out.println(data2);
		System.out.println(data);
	};
}
