package com.kosta.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//어떤 사람의 이름, 주소, 전화를 입력받아서 출력하는 프로그램을 작성
public class FileWriterTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, addr, phone;
		
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("주소 : ");
		addr = sc.next();
		System.out.println("전화번호 : ");
		phone = sc.next();
		
		//System.out.println(name+addr+phone);
		
		try {
			//FileWriter fw = new FileWriter("c:/data/info.txt");
			FileWriter fw = new FileWriter("c:/data/info.txt", true);
			fw.write("이름:"+name+"\n");
			fw.write("주소:"+addr+"\n");
			fw.write("번호:"+phone+"\n");
			fw.close();
			System.out.println("파일이 생성되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
