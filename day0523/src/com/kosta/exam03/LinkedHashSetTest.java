package com.kosta.exam03;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		Set data = new LinkedHashSet();
		data.add("된장찌개");
		data.add("백반");
		data.add("짬뽕");
		data.add("김치찌개");
		boolean f1 = data.add("짬뽕"); //중복이기 때문에 실패
		System.out.println(data);
		//[된장찌개, 백반, 짬뽕, 김치찌개]
		System.out.println(f1);
		
		
	}
}
