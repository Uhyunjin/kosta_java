package com.kosta.exam03;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s = new TreeSet();
		Random r = new Random();
		
		do {
			s.add(r.nextInt(45)+1);
		} while (s.size()<6);

		System.out.println(s);
		System.out.println(s.size());
	}

}
