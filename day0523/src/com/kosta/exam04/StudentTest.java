package com.kosta.exam04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	public static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("메뉴를 선택하세요");
		System.out.println("[0]종료 [1]추가 [2]검색 [3]삭제 [4]목록");
	}
	private static void insertStudent(List<Student> list) {
		String name, addr, phone;
		
		System.out.println("*** 학생 정보 추가 ***");
		System.out.println("학생 이름을 입력해주세요 : ");
		name = sc.next();
		
		System.out.println("학생 주소를 입력해주세요 : ");
		addr = sc.next();

		System.out.println("학생 전화번호를 입력해주세요 : ");
		phone = sc.next();
		
		Student s= new Student(name,addr,phone);
		list.add(s);
		
		System.out.println("학생 정보를 추가하였습니다.");
	}
	
	private static void deleteStudent(List<Student> list) {
		System.out.println("*** 학생 정보 검색 ***");
		System.out.println("삭제할 학생의 전화번호를 입력해주세요");
		String phone;
		phone = sc.next();
		int i = 0;
		int cnt = list.size();
		for (i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if (s.getPhone().equals(phone)) {
				list.remove(i);
				break;
			}
		}
		//삭제하려는 학생이 리스트의 맨 마지막에 있을때를 대비해서
		//미리 리스트 사이즈를 cnt 변수에 담아놓고 비교한다.
		if (i==cnt) {
			System.out.println("삭제하려는 학생의 정보가 없습니다.");			
		}
	}
	
	private static void searchStudent(List<Student> list) {
		String phone;
		System.out.println("*** 학생 정보 검색 ***");
		System.out.println("학생의 전화번호를 입력해주세요 : ");
		phone = sc.next();
		boolean flag = false;
		for (Student s : list) {	
			if ((s.getPhone()).equals(phone)) {
				System.out.println("*** 찾고자 하는 학생 정보 ***");
				System.out.println(s);
				flag = true;
				break;
			}
		}// end for
		if (flag==false) {
			System.out.println("찾고자 하는 학생이 없습니다.");
		}
	}
	
	private static void listStudent(List<Student> list) {
		for (Student student : list) {
			System.out.println(student);
		}
	}

	public static void main(String[] args) {

		int sel;
		List<Student> list = new ArrayList<Student>();
		
		while (true) {
			menu();
			sel = sc.nextInt();
			
			if (sel==0) {
				System.out.println("종료");
				break;
			}
			
			switch(sel) {
				case 1:insertStudent(list); break;
				case 2:searchStudent(list); break;
				case 3:deleteStudent(list); break;
				case 4:listStudent(list); break;
			}//end swtich
			
		}//end while
	}//end main

}
