package com.kosta.exam;
import java.util.Scanner;
public class ScoreCard {

	public static void main(String[] args) {

		int []data = new int[5];
		String []name = new String[5];
		
		Scanner sc = new Scanner(System.in);

		int max=0;
		int index = 0;
		String indexName = "";
		
		for(int i=0;i<data.length;i++) {
			System.out.println((i+1)+"번 학생의 이름을 입력해주세요 : ");
			name[i] = sc.next();			
			System.out.println((i+1)+"번 학생의 점수를 입력해주세요 : ");
			data[i] = sc.nextInt();
			
			if(data[i]>max) {
				max =  data[i];
				index = i+1;
				indexName = name[i];
			}
		}
		System.out.printf("최고 점수는 %d번 %s학생의 %d점 입니다.", index, indexName, max);
	}
}
