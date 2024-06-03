package com.kosta.exam01;

import java.io.File;

//c:/data/bus.pan 삭제
public class FileTest {
	public static void main(String[] args) {
		//디렉토리도 파일의 범주에 있다
		File file = new File("c:/data/java");
		System.out.println("3초 뒤에 파일이 삭제됩니다!");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		file.delete();
	}
}