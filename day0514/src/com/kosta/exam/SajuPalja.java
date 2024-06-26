package com.kosta.exam;

import java.util.Date;
import java.util.Scanner;

public class SajuPalja {

	public static int[] calIndex(int year, int month, int day, int hour) {
		// 생년을 12로 나눈 나머지
		int idx1 = year%12;
		//띠
		///String yearAnimal = animals[res];
		
		//띠 + 생월
		int idx2 =  (idx1+month-1)%12;
		//String monthAnimal = animals[res2];
		
		//월 + 일
		int idx3 = (idx2+day-1)%12;
		//String dayAnimal = animals[res3];
		
		//일 + 시
		//24시간을 2로 나누면 0~11
		int idx4 = (idx3+(hour/2))%12;
		//String hourAnimal = animals[res4];
		
		int []indexArray = {idx1, idx2, idx3, idx4};
		
		return indexArray;
	}
	
	public static void getSaju(String name, int []arr) {
		String []animals = {"신","유","술","해",
							"자","축","인","묘",
							"진","사","오","미"};
				// 나머지 4 = 자
				// 나머지 0 = 신

		String []fortune = {"천역 : 귀인 대접",
							"천간 : 액땜",
							"천수 : 권력, 리더십",
							"천명 : 파동이 있어요, 해외 이주",
							"천귀 : 인간성, 법 없이도 살 사람",
							"천액 : 머리가 좋음",
							"천권 : 복을 갖고태어남",
							"천파 : 외로움을 많이 타요",
							"천인 : 역마살, 다방면에 관심",
							"천문 : 이성에게 매력있음",
							"천복 : 손재주가 있어요.",
							"천고 : 명이 길어요"};
		
		System.out.print("*** "+name+"님의 사주의 특징 ***");
		System.out.println();
		for (int i : arr) {
			System.out.printf("%s\n", fortune[i]);
		}
		System.out.println();
	}

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		while(flag) {
			System.out.print("이름을 입력해주세요 : ");
			String name = sc.next();
			
			// 연도 입력
			System.out.print("태어난 연도를 입력해주세요 : ");
			int year= sc.nextInt();
			
			// 연도체크 1900~2024(date)
			Date today = new Date();
			int thisYear = today.getYear()+1900;
			if (year <1900 || year > thisYear) {
				System.out.println("태어난 연도는 1900년~2024년 범위에서 입력해주세요");
				continue;
			}
			
			// 월 입력
			System.out.print("태어난 월을 입력해주세요 : ");
			int month = sc.nextInt();
			
			// 월 체크 1-12
			if (month <1 || month > 12) {
				System.out.println("태어난 월은 1월~12월 범위에서 입력해주세요");
				continue;
			}
			
			// 날짜 입력
			System.out.print("태어난 일자를 입력해주세요 : ");
			int day = sc.nextInt();
			// 일 체크 30일 31일 28일
			if (month==2) {
				if (day <1 || day > 28) {
					System.out.println("태어난 일은 1일~28일 범위에서 입력해주세요");
					continue;
				}
			}else if(month==4||month==6||month==9||month==11){
				if (day <1 || day > 30) {
					System.out.println("태어난 일은 1일~28일 범위에서 입력해주세요");
					continue;
					}
			}else {
				if (day <1 || day > 31) {
					System.out.println("태어난 일은 1일~28일 범위에서 입력해주세요");
					continue;
				}
			}
			
			//시간 입력
			System.out.print("태어난 시간을 입력해주세요\n(24시간 기준 0시-자정 12시-정오)\n: ");
			int hour = sc.nextInt();
			// 시간 체크 0-23 사이에서 입력
			if (hour<0 || hour > 24) {
				System.out.println("태어난 시간은 1시~24시 범위에서 입력해주세요");
				continue;
			}
			
			System.out.printf("%s님은 %d년 %d월 %d일 %d시에 태어나셨습니다.\n", name, year, month, day, hour);
			getSaju(name,calIndex(year, month, day, hour));
			System.out.println("다시 하시겠습니까?");
			System.out.println("[1] 나가기");
			System.out.println("[2] 다시하기");
			int yesNo = sc.nextInt();
			
			if (yesNo==1) {
				flag = false;
			}else {
				continue;
			}
		}
	
	}

}
