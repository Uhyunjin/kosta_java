package com.kosta.exam01;
import java.util.Scanner;

public class EmployeeTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee []employee = new Employee[1000];
		int level, workingHour, hourlyRate, type, i=0;
		String name="", no="";
		
		while(true) {
			
			while(true) {
				System.out.println("사원의 급여 종류를 입력해주세요");
				System.out.println("[0]종료\t[1]월급제\t[2]시간제");
				type = sc.nextInt();
				
				if (type>=0 && type<=2) {
					break;
				}
			}
			if (type==0) {
				break;
			}
			
			System.out.print("사원의 이름을 입력해주세요 : ");
			name = sc.next();
			System.out.print("사원번호를 입력해주세요 : ");
			no = sc.next();
			
			switch(type) {
			case 1 :
				System.out.println("사원의 호봉을 입력해주세요");
				System.out.println("[1] [2] [3]");
				while(true) {
					level = sc.nextInt();
					if (level>=1&&level<=3) {
						break;
					}
					System.out.println("호봉을 범위 내에서 입력해주세요");
				}
				employee[i] = new SalariedEmployee(name, no, level);
				employee[i].computeSalary();
				break;
			case 2 :
				System.out.println("근무시간을 입력해주세요");
				workingHour = sc.nextInt();
				System.out.println("시급을 입력해주세요");
				hourlyRate= sc.nextInt();
				employee[i] = new HourlyEmployee(name, no, workingHour, hourlyRate);
				employee[i].computeSalary();
				break;
				
			}//end switch
			i++;
		}//end while
		System.out.println("작업종료");
		
		for (int j = 0; j < i; j++) {
			System.out.println(employee[j]);
			
		}//end for
	}//end main
}
