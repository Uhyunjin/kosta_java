package com.kosta.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("spring", "0000");
		map.put("summer", "1111");
		map.put("autumn", "2222");
		map.put("winter", "3333");
		
		
		//map의 데이터만큼 루프 돌기
		//map으로부터 key를 반환하는 메서드 set
		
		Set<String> keyList= map.keySet();	//맵에 있는 모든 키를 가져온다
		
		Iterator<String> iter = keyList.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
//			System.out.println(key);
			String value = map.get(key);
			System.out.println(key+" : "+value);
		}
	}

}
