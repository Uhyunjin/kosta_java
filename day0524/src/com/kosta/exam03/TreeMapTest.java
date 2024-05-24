package com.kosta.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		
		//어떤 사람의 이름 주소 전화번호를 리스트에 담기
		Map<String, String> data = new TreeMap<String, String>();
		
		data.put("name", "홍길동");
		data.put("addr", "종로구");
		data.put("phone", "111");
		
	}

}
