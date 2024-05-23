package com.kosta.exam01;

class A{
	public void pro() {
		System.out.println("프로입니다");
	}
}
class B extends A{
	public void pro() {
		System.out.println("B클래스의 프로입니다");
	}
}

public class FinalTest {
	public static void main(String[] args) {
		B ob = new B();
		ob.pro();
	}

}
