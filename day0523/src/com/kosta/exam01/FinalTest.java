package com.kosta.exam01;

class A{
	public void pro() {
		System.out.println("A클래스의 프로입니다");
	}
	public final void test() {
		System.out.println("A클래스의 test입니다");
	}
}
class B extends A{
	public void pro() {
		System.out.println("B클래스의 프로입니다");
	}
//	public void test() { //에러
//		System.out.println("A클래스의 test입니다");
//	}
	//부모클래스의 final 메서드는 오버라이딩 불가능
}

public class FinalTest {
	public static void main(String[] args) {
		B ob = new B();
		ob.pro();
	}

}
