package com.kosta.exam_game4;

public class Enemy extends GraphicObject {
	//적은 처음에 왼쪽 방향으로 움직인다
	int dx = -10;
	
	public Enemy(String name) {
		super(name);
		//적의 처음 위치
		x=500;
		y=0;
	}
	public void update() {
		//적의 x좌표의 변화
		x+=dx;
		//만약 적의 x좌표가 0보다 작아지면
		if (x<0) {
			//적이 오른쪽으로 움직이도록 x를 양의 방향으로 움직인다
			dx = +10;
			
			//너무 오른쪽으로 가면 다시 방향을 왼쪽으로 바꿔준다
		}
		if (x>500) {
			dx = -10;
		}
	}
	
	
}
