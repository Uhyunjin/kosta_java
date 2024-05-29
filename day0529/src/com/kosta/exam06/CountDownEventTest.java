package com.kosta.exam06;

public class CountDownEventTest {
	public static void main(String[] args) {
		new CountDownEvent(3500, "연결 장치 분리!!!").start();
		new CountDownEvent(20000, "발사!!!").start();
		CountDownRunnable c = new CountDownRunnable();
		new Thread(c).start();
	}
}