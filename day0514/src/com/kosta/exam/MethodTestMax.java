package com.kosta.exam;
//두 개의 실수를 매개변수로 전달받아 그 중 큰 수를 찾아 출력하는 메서드를 정의하고 호출해보기
public class MethodTestMax {
	
	public static void printMax(double a, double b) {
		double max = a;
		if (a<b) {
			max = b;
		}
		System.out.printf("%.2f와 %.2f 중 더 큰 숫자는 %.2f입니다.",a,b,max);
	}
	public static void main(String[] args) {
		printMax(3.14,4.411);
	}
}
