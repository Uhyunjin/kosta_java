package com.kosta.exam03;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set data = new HashSet();
		//auto boxing
		boolean f1 = data.add(100);
		boolean f2 = data.add("사과");
		boolean f3 = data.add(56.7);
		data.add(true);
		// 받아 넣어왔는지 아닌지 관심이 없으면 안써도 된다.
		boolean f4 = data.add(100);
		// data의 갯수는 4개
		
		//data의 구성요소 출력하기
		System.out.println(data);
	}
}
