package com.kosta.exam03;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoTest2 {

	public static void main(String[] args) {
		Set s = new TreeSet();
		Random r = new Random();	
		
		for (int i = 0; s.size()<6; i++) {
			s.add(r.nextInt(45)+1);
		}
		System.out.println(s);
		System.out.println(s.size());
	}
}
