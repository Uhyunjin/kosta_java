package com.kosta.exam01;

public class StringAndStringBuffer {
	public static void pro(String data) {
		System.out.println(data + "를 처리하였습니다");
	}
	public static void main(String[] args) {
		StringBuffer cmd = new StringBuffer();
		cmd.append("사과 ");
		cmd.append("포도 ");
		cmd.append("수박 ");
		System.out.println(cmd);
		//pro(cmd);
		pro(cmd.toString());
	}
}
