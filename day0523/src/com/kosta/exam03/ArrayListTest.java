package com.kosta.exam03;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList data = new ArrayList();
		data.add("된장찌개");
		data.add("돈까스");
		data.add("냉면");
		data.add("김치찌개");
		data.add("냉면");
		System.out.println(data.get(1));
		
		String food = (String)data.get(2);
		System.out.println(food);
	}

}
