package com.kosta.exam;

public class PrimitiveTypeAndArraySol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {10,20,30,40,50};
		int []b = {10,20,30,40,50};
		
		boolean flag = true;
		
		if (a.length!=b.length) {
			flag = false;
		} else {
			for (int i = 0; i < b.length; i++) {
				if (a[i] != b[i]) {
					flag = false;
					break;
				}
			}
		}
		
		if (flag) {
			System.out.println("배열의 내용이 일치합니다.");
		}else {
			System.out.println("배열의 내용이 다릅니다.");
		}
	}

}
