package com.kosta.exam01;

public class LastIndexOfTest {
	public static void main(String[] args) {
		String data= "hello java hello oracle";
		int n = data.lastIndexOf("hello");
		System.out.println(n);
		int n2 = data.indexOf("hello");
		System.out.println(n2);
	}
}
