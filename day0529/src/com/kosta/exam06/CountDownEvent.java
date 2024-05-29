package com.kosta.exam06;

public class CountDownEvent extends Thread{
	
	private int delay;
	private String message;
	
	public CountDownEvent(int delay, String message) {
		this.delay = delay;
		this.message = message;
	}
	
	public void run() {

			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(message);				
			
		}
}
