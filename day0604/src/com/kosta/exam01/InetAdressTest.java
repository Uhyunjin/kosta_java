package com.kosta.exam01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressTest {
	public static void main(String[] args) {
		try {
//			InetAddress addr = InetAddress.getByName("www.naver.com");
//			System.out.println(addr);
			InetAddress[]addr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress address : addr) {
				System.out.println(address);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
