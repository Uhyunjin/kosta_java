package com.kosta.exam10;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape []data = new Shape[1000];
		int menu, x, y;
		int width, length; 
		double radius;
		int i=0;
		while(true) {
			while(true) {
				System.out.println("도형의 종류를 선택하세요");
				System.out.println("[1] 사각형");
				System.out.println("[2] 원");
				System.out.println("[0] 종료");
				menu = sc.nextInt();
				if (menu>=0 && menu <= 2) {
					break;
				}
			}
			if (menu == 0) {
				break;
			}
			System.out.println("도형의 x위치 : ");
			x = sc.nextInt();
			System.out.println("도형의 y위치 : ");
			y = sc.nextInt();
			switch(menu) {
			case 1: 
				System.out.println("사각형의 가로 길이 : ");
				width = sc.nextInt();
				System.out.println("사각형의 세로 길이 : ");
				length = sc.nextInt();
				data[i] = new Rect(x, y, width, length); break;
			case 2:
				System.out.println("원의 반지름 : ");
				radius = sc.nextDouble();
				data[i] = new Round(x, y, radius); break;
			}//end case
			i++;
		}//end while
		
		System.out.println("작업종료");
		
		for (int j = 0; j < i; j++) {
			data[j].calcArea();
			data[j].calcRound();
			System.out.println(data[j]);
		}
	
	}

}
