package com.kosta.exam03;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GameTestMap {

	public static void main(String[] args) {
		// 컴퓨터와 사용자가 가위바위보 하는 게임을 만들자
		Map<Integer, String> map
			 = new HashMap<Integer, String>();
		
		map.put(0, "가위");
		map.put(1, "바위");
		map.put(2, "보자기");
	
		//컴퓨터가 가위바위보 중 하나를 무작위로 정하도록 한다,
		Random r = new Random();
		int randomNumber = r.nextInt(3);
		String computer = map.get(randomNumber);
		
		//사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("무엇을 낼까요? [0]가위 [1]바위 [2]보자기");
		int user = sc.nextInt();
		
		System.out.println("컴퓨터는 " + computer + "를 냈습니다.");
		System.out.println("사용자는 " + map.get(user) + "를 냈습니다.");
		
		boolean winCase = (user==0 && randomNumber==2) ||
						  (user==1 && randomNumber==0) ||
						  (user==2 && randomNumber==1);
		
		if (winCase) {
			System.out.println("사용자가 이겼습니다.");
		} else if (user==randomNumber) {
			System.out.println("비겼습니다.");
		} else {
			System.out.println("컴퓨터가 이겼습니다.");
		}

					
		}
			
		
	}

