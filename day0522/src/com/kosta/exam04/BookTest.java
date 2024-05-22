package com.kosta.exam04;

abstract class Book{
	public abstract int getLateFees(int days);
	//만약 구체화된 메서드라면 
	public void pro() {System.out.println("pro");
	}
}
class Novel extends Book{
	public int getLateFees(int days) {
		return days*300;
	}
}
class Poet extends Book{
	public int getLateFees(int days) {
		return days*200;
	}
}

public class BookTest {
	public static void main(String[] args) {
		Book n = new Novel();
		Book p = new Poet();
		n.pro();
		p.pro();
		//부모의 메서드 사용
		n.getLateFees(8);
		p.getLateFees(9);
		//오버라이딩 한 자식의 메서드 우선 사용
		System.out.println(n);

	}

}
