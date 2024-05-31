package com.kosta.exam03;

import java.util.StringTokenizer;

public class MyDate {
	String year, month, date;
	
	public MyDate() throws IllegalArgumentException {
		throw new IllegalArgumentException("예외");
	}

	public MyDate(String day) throws IllegalArgumentException{
		StringTokenizer st = new StringTokenizer(day, "/", true);
		//stringtokenizer가 null값을 처리해주지 않는데...어카지
		
//		if (st.nextToken()==null) {
//			throw new IllegalArgumentException("IllegalArgumentException");
//		}else {			
//			year = st.nextToken();
//		}
//		if (st.nextToken()==null) {
//			throw new IllegalArgumentException("IllegalArgumentException");
//		}else {
//			month = st.nextToken();			
//		}		
//		if (st.nextToken()==null) {
//			throw new IllegalArgumentException("IllegalArgumentException");
//		}else {			
//			date = st.nextToken();
//		}
		
		
	}
}
