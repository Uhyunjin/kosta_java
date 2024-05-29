package com.kosta.exam03;
public class PersonTest {
	public static void main(String[] args) {
		Person kim = new Person("kim");
		Person lee = new Person("lee");

		Thread threadKim = new Thread(kim);
		Thread threadLee = new Thread(lee);

//		(new Thread(kim)).start();
//		(new Thread(lee)).start();
//		=> 이렇게 한번에 실행할 수 있다.
		
		threadKim.start();
		threadLee.start();
		
	}
}
