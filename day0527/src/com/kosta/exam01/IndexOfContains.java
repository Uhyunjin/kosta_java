package com.kosta.exam01;

//문자열 데이터에 "java"를 포함하고있는지
public class IndexOfContains {
	public static void main(String[] args) {
		String data = "hello java hello oracle";
		if (data.indexOf("java")!=-1) {
			System.out.println("자바 포함");
		}else {
			System.out.println("자바 미포함");
		}
		
		if (data.contains("java")) {
			System.out.println("자바 포함");
		}else {
			System.out.println("자바 미포함");
		}
		
		if (data.matches(".*java.*")) {
			System.out.println("자바 포함");
		}else {
			System.out.println("자바 미포함");
		}
	}
}
