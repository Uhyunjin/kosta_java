package com.kosta.exam03;

import java.util.Iterator;
import java.util.Random;

public class RandomName {

	public static void main(String[] args) {
		
		String []name = {"변시우","임유나","홍석영",
						 "조영흔","유요한","이동준",
						 "박성빈","박준수","김예은",
						 "이재원","장동건","최모래",
						 "최가은","박규희","유현진",
						 "공희상","강동균"};
		Random r = new Random();
		//int randomNumber = r.nextInt(17);
		int randomNumber = r.nextInt(name.length);
		System.out.println(name[randomNumber]);
		String randomName="";
		for (int i = 0; i < 50; i++) {
			randomNumber = r.nextInt(name.length);
			randomName = name[randomNumber];
			System.out.println(randomName);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("***당첨자***");
		System.out.println(randomName);
	}

}
