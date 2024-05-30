package com.kosta.exam02;

public class PersonTest {
	public static void main(String[] args) {
		Person spring = new Person("Spring");
		Person summer = new Person("Summer");
		Person autumn = new Person("Autumn");
		Person winter = new Person("Winter");
		
		//쓰레드 우선순위 설정
		spring.setPriority(Thread.MAX_PRIORITY);
		winter.setPriority(Thread.MIN_PRIORITY);
		//가급적 이렇게 처리해줌(안해줄수도...)
		
		spring.start();
		summer.start();
		autumn.start();
		winter.start();
	}
}
