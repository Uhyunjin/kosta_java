package com.kosta.exam;
public class MethodEqualsArray {
	public static boolean check(double []a, double []b) {
		boolean flag = false;
		
		if (a.length!=b.length) {
			return flag;
		}else {
			for (int i= 0;  i< b.length; i++) {
				if (a[i]!=b[i]) {
					flag = false;
				}else {
					flag = true;
				}
			}
		}
		return flag;
	}
	public static void main(String[] args) {	
		double []a = {3,5,2,6,3};
		double []b = {3,5,2,6,3,7};
		System.out.println(check(a,b));

	}
}
