package com.kosta.exam06;

public class CountDownRunnableTest {
	
	public static void main(String[] args) {
		CountDownRunnable r = new CountDownRunnable();
		new Thread(r).run();
	}

}
