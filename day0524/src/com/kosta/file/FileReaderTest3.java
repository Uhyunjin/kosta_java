package com.kosta.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

//어떤 사람의 이름, 주소, 전화를 입력받아서 출력하는 프로그램을 작성
public class FileReaderTest3 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String name, addr, phone;
//		
//		System.out.println("이름 : ");
//		name = sc.next();
//		System.out.println("주소 : ");
//		addr = sc.next();
//		System.out.println("전화번호 : ");
//		phone = sc.next();
		//System.out.println(name+addr+phone);
		//List<Character> list = new List<Character>();
		try {
			FileReader fr = new FileReader("c:/data/info.txt");
			
			while(true) {
				if (fr.read()==-1) {
					break;
				}
				int ch = fr.read();
				char c = (char)ch;
				//list.add(c);
				System.out.print(c);
			}
			fr.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
