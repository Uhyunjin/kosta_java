package com.kosta.exam06;

public class Dove extends Bird{

	@Override
	public void sound() {
		System.out.println("Coo Coo");
		
	}
	
	public static void main(String[] args) {
		//Bird b = new Bird();
		//추상 메서드는 객체 생성 불가능
		Dove d = new Dove();
		d.sound();
		
		new Dove().sound();
		
		Bird b = new Dove();
		//부모클래스 참조변수는 자식클래스의 객체를 생성할 수 있다.
		//상속관계에 있을 때 자식클래스는 부모클래스에 포함관계에 있기 때문에
		//부모클래스인 Bird의 참조변수 b가 자식클래스의 객체인 Dove를 참조할 수 있어요
	}

}
