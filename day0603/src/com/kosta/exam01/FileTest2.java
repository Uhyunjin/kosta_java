package com.kosta.exam01;

import java.io.File;
import java.util.Iterator;

//c:/data/bus.pan 삭제
public class FileTest2 {
	public static void main(String[] args) {
		File file = new File("c:/data");
		for (String f : file.list()) {
			System.out.println(f);
		}
	}
}