package com.kosta.exam08;

import java.util.Random;

public class Product {	//생산자와 소비자가 공유할 자원인 제품클래스
	
	int number; //새로운 정수, 제품
	//생상자는 이 정수를 계속하여 새롭게 만들어주고
	//소비자는 이 정수를 계속하여 가져다 쓰도록 한다.
	
	boolean isNew;	//새 제품이 생산되었는지 판별하기 위한 변수
	//생산자는 새 제품을 생산한 다음에 isNew에 true를 저장하고
	//소비자는 제품을 소비한 후에 isNew에 false를 저장한다
	
	public synchronized void makeNumber() {	//생상자가 새 제품을 생산하기 위한 메서드
	//생산자는 새 제품을 생산한 다음 isNew에 true를 저장
	//생산자가 새 제품을 만드는 동안 소비자는 접근을 못해야하므로 임계영역 설정
		
		try {
			
			while (isNew) {	//제품이 소비될 때까지 기다리자
				wait();
			}
			
			Random r= new Random();	//새 제품 만들기
			number = r.nextInt(100)+1;
			
			System.out.println("생산자가 생산함 : "+number);	//생산된 제품을 출력		
			
			isNew = true;	// 새 제품을 만들었다고 표시
			
			notify();	// 대기중인 소비자를 깨우기
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public synchronized int useNumber() {
		
		int n = 0;
		try {
			while (!isNew) {	//새로운 제품을 생산할 때까지 기다린다
				wait();
			}
			n=number;
			System.out.println("소비자가 소비함 : " + number);
			isNew=false;
			notify();
			
		} catch (Exception e) {
			// TODO: handle exception
		}		
		
		return n;
	}
	
	
}
