package com.kosta.exam;
// 몇 단을 출력할지를 매개변수로 전달받아 해당하는 구구단을 출력하는 메서드를 정의한다.
public class MethodTestGugudan {
	
	public static void gugudan(int number) {
		
		if (number<2 || number>9) {
			return;
		}
		
		System.out.printf("*** %d단 입니다 ***", number);
		System.out.println();
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d", number, i, number*i);
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan(1);
		gugudan(9);
	}
}
