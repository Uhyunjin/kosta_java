package com.kosta.exam03;

import java.util.Random;

public class RandomTest01 {
	public static void main(String[] args) {
		//1-10 사이의 난수 발생시키기
		
		//방법1
		Random r1 = new Random();
		int data1 = r1.nextInt(10)+1;
		System.out.println(data1);
		
		
		//방법2
		Random r2 = new Random();
		int data2 = r2.nextInt();
		if (data2<0) {
			data2 = data2 *-1;
		}
		data2 = data2 % 10 + 1;
		System.out.println(data2);
		
		//방법3
		Random r3 = new Random();
		int data3 = r3.nextInt() >>> 1; //무조건 양수로 만들어주는 연산자(숫자가 같지는 않음, 부호만 변화);
		data3 = data3 % 10 + 1;
		System.out.println(data3);
		
		//방법4
		long data4 = System.currentTimeMillis()%10 +1;
		System.out.println(data4);
		
		
		
	}

}
