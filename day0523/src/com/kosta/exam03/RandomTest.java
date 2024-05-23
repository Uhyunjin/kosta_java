package com.kosta.exam03;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		//랜덤 객체를 만들어서
		int data = r.nextInt(); //int의 범위 내에서 무작위로 숫자 추출
		//데이터 변수에 r객체의 랜덤 수 담기
		System.out.println(data);
		
		int data2 = r.nextInt(10); // 0~(10-1)사이에서 무작위 추출
		System.out.println(data2);
		
		int data3 = r.nextInt(10)+1; // 1~10사이에서 무작위 추출
		System.out.println(data3);


	}

}
