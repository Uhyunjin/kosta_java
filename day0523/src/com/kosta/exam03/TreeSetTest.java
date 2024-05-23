package com.kosta.exam03;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		Set data = new TreeSet();
		data.add("된장찌개");
		data.add("백반");
		data.add("짬뽕");
		data.add("김치찌개");
		boolean f1 = data.add("짬뽕"); //중복이기 때문에 실패
		System.out.println(data);
		//[김치찌개, 된장찌개, 백반, 짬뽕] 가나다 정렬!
		System.out.println(f1);
		
	}
}
