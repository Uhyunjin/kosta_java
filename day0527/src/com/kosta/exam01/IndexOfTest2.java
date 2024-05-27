package com.kosta.exam01;

public class IndexOfTest2 {
	public static void main(String[] args) {
		String data= "hello java hello oracle";
		int n=data.indexOf("hello");
		System.out.println(n);
		int n2=data.indexOf("hello",1); //1번째부터 찾아봐
		System.out.println(n2);

	}
}
