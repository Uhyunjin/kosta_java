package com.kosta.exam01;

public class CharAtTest02 {
	public static void main(String[] args) {
		String data = "hello java";
		int length = data.length();
		System.out.println(length);
		int n =0;
		
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			System.out.print(ch+"\t");
			if (ch=='a') {
				n++;
			}
		}//end for
		System.out.println();
		System.out.println("a의 개수 : "+n);
	}
}
