package com.kosta.exam10;

import java.util.Scanner;

public class ShapeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape []array = new Shape[100];
		Scanner sc = new Scanner(System.in);
		int x, y, i=0, height, width, z;
		double radius;
		
		while(true) {
			
			while(true) {				
				System.out.println("생성할 도형을 선택해주세요");
				System.out.println("[0] 종료");
				System.out.println("[1] 원");
				System.out.println("[2] 사각형");
				z = sc.nextInt();
				if (z<=2 && z>=0) {
					break;	
				}
				
			}
			
			if (z==0) {
				break;
			}
			
			System.out.println("x좌표를 입력해주세요 : ");
			x = sc.nextInt();
			System.out.println("y좌표를 입력해주세요 : ");
			y = sc.nextInt();
			
			switch (z){
			case 1 : 
				System.out.println("반지름을 입력해주세요 : ");
				radius = sc.nextDouble();
				array[i]=new Round(x, y, radius);
					array[i].calcArea();
					array[i].calcRound();
				break;
			case 2 :
				System.out.println("높이를 입력해주세요 : ");
				height = sc.nextInt();
				System.out.println("가로를 입력해주세요 : ");
				width = sc.nextInt();
				array[i]=new Rect(x, y, height, width);
					array[i].calcArea();
					array[i].calcRound();
				break;
			}// end switch
			i++;
		}// end while
		System.out.println("작업종료");
		
		for (int j = 0; j < i; j++) {
//			array[j].calcArea();
//			array[j].calcRound();
			System.out.println(array[j]);
			//ㅜㅜㅜ 이거 i로 써놔서 계속 null 만떴네 빡치게 ㅜㅜ
		}
		
	}

}
