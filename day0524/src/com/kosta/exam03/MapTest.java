package com.kosta.exam03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> data = new LinkedHashMap<String, String>();
		// 꼭 String뿐 아니라 다양한 자료형이 올 수 있다.
		
		data.put("name", "홍길동");
		data.put("addr", "종로구");
		data.put("phone", "111");
		
		String addr = data.get("addr");
		System.out.println(addr);
		System.out.println(data);
	}
}
