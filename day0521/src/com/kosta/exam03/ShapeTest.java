package com.kosta.exam03;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape []array = new Shape[1000];
		// 최대 천개가 넘지 않을거야!
		int type; //선택
		int n=0; //while문에 사용
		int x, y; //좌표 담을 변수
		
		double width, length, height, radius;
		
		
		//우리의 선택지 사각형/삼각형/원기둥/큐브
		while(true) {
			
			do {
				System.out.println("[1]사각형\t[2]삼각형\t[3]직육면체\t[4]원기둥\\t[0]종료");				
				type = sc.nextInt();
			} while (type<0 || type>4);
			
			if (type==0) {
				break;
			}
			System.out.println("x 좌표 : ");
			x = sc.nextInt();
			System.out.println("y 좌표 : ");
			y = sc.nextInt();
			
			switch(type) {
				case 1:	//사각형 클래스
					System.out.println("사각형의 가로 길이 : ");
					width = sc.nextDouble();
					System.out.println("사각형의 세로 길이 : ");
					height = sc.nextDouble();
					array[n] = new Rectangle(x,y,width,height);
					// 상속 계층에 있을때 조상클래스 참조변수가 후손 객체 생성가능
					break;
				case 2:	//삼각형 클래스
					System.out.println("삼각형의 가로 길이 : ");
					width = sc.nextDouble();
					System.out.println("삼각형의 세로 길이 : ");
					height = sc.nextDouble();
					array[n] = new Triangle(x,y,width,height);
					break;
				case 3:
					System.out.println("직육면체의 가로 길이 : ");
					width = sc.nextDouble();
					System.out.println("직육면체의 세로 길이 : ");
					height = sc.nextDouble();
					System.out.println("직육면체의 높이 : ");
					length = sc.nextDouble();
					array[n] = new Cube(x,y,width,height, length);
					break;
				case 4:
					System.out.println("원기둥의 반지름 : ");
					radius = sc.nextDouble();
					System.out.println("원기둥의 높이 : ");
					length = sc.nextDouble();
					array[n] = new Cylinder(x,y,length,radius);
					break; //안써도 되지만 써서 분명하게 해준다.	
			}//end switch
			n++;
		}//end while
		for (int i = 0; i < n; i++) {
			if(array[i] instanceof TwoDimShape) {
				//array[i].calcArea();
				//부모의 참조변수를 가지고 자식의 객체를 생성할 수는 있지만
				//자식에게 새로 추가된 메서드를 바로 호출할 수는 없다
				//자식의 새로운 메서드를 호출하기 위해서는 type casting 즉 형변환이 필요하다
				((TwoDimShape)array[i]).calcArea();

			}else {
				((ThreeDimShape)array[i]).calcVolume();
			}
			System.out.println(array[i]);
		}
	}//end main

}
