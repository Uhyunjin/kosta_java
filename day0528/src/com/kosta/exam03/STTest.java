package com.kosta.exam03;

import java.util.StringTokenizer;

public class STTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("2024//3", "/");
		String year = st.nextToken();
		String month = st.nextToken();
		String day = st.nextToken();
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
//		while (st.hasMoreTokens()) {
//			Object object = (Object) st.nextElement();
//			System.out.println(object);
//		}
	}

}
