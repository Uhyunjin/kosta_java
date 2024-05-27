package com.kosta.exam01;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String data="hello java hello oracle";
		StringTokenizer st = new StringTokenizer(data," ");
	    while(st.hasMoreTokens()) {
	    	System.out.println(st.nextToken());
	    }
	}
}
