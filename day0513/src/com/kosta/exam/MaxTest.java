package com.kosta.exam;

import java.util.Scanner;

public class MaxTest {
// 최고점과 인덱스 찾기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []score = new int[5];
		for (int i=0;i<score.length; i++) {
			System.out.println(i+"번째 학생의 점수 입력 : ");
			score[i] = sc.nextInt();
		}
		int max=score[0];
		int index=0;
		
		for (int i=1;i<score.length;i++) {
			if (score[i]>max) {
				max = score[i];
				index=i;
			}	
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최대값의 인덱스 : "+(index+1));
	}

}
