package com.kosta.exam04;
import java.util.Date;

public class Hello2 extends Thread{
	public void run() {
		int i=0;
		while (true) {
			Date d = new Date();
			System.out.print(d.getHours()+"시 ");
			System.out.print(d.getMinutes()+"분 ");
			System.out.print(d.getSeconds()+ "초 ");
			System.out.println("안녕하세요?"+(i+1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}


}
