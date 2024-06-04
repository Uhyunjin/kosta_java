package com.kosta.exam01;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;

public class URLTest {
	public static void main(String[] args) {
		byte []data = new byte[200];
		try {
			//네트워크 상으로 url에 연결
			URL url = new URL("https://hanbit.co.kr/store/books/new_book_list.html");
			
			//입출력으로 url의 데이터 가져오기
			InputStream is = url.openStream();
			
			String str = "";
			//더이상 읽을게 없으면 -1을 반환한다
			while (is.read(data)!=-1) {
				str += new String(data);
				Arrays.fill(data, (byte)0);
				//비워주기
			}
			System.out.println(str);
			is.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
