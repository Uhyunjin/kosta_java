package com.kosta.exam01;

public class SplitTest {
	public static void main(String[] args) {
		String data = "spring summer autumn winter";
		String []arr = data.split(" ");
		for (String a: arr) {
			System.out.println(a);
		}
	}
}
