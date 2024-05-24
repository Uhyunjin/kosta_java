package com.kosta.exam02;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList2 {
	
	public static void main(String[] args) {
		// ArrayList<String> data = new ArrayList<String>();
		LinkedList<String> data = new LinkedList<String>();
		data.add("사과");
		data.add("딸기");
		data.add("수박");
		System.out.println(data);
		data.add(1, "포도");
		System.out.println(data);
		data.remove(2);
		System.out.println(data);
	}
}
