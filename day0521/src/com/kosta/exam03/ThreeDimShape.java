package com.kosta.exam03;

public abstract class ThreeDimShape extends Shape {
	protected double volume;
	public abstract void calcVolume();
	public void pro() {
		System.out.println("ThreeDimShape의 pro입니다.");
	}
	//body가 구체화 된 메서드가 있어도 하나라도 추상 메서드면 추상 클래스가 된다.
	
	public ThreeDimShape(int x, int y) {
		super(x, y);
	}// 얘가 없어도 하위 클래스에서 에러남
	//이건 하위 클래스 생성자가 매개변수 있는 생성자를 만들어놨기 때문
	
	public ThreeDimShape() {
		super();
		// TODO Auto-generated constructor stub
	}//이거 없으면 왜 오류나지????
	//얘가 없으면 기본생성자가 없음
	//그럼 매개변수를 항상 입력해줘야하고
	//super()가 없으면 에러가 안나는데?
	//어차피 Shape도 x,y없어도 생성되니까 상관없는듯
	
	
	@Override
	public String toString() {
		return "ThreeDimShape [volume=" + volume + ", x=" + x + ", y=" + y + "]";
	}
	public double getVolume() {
		return volume;
	}
	

}
