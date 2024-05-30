package com.kosta.exam_game4;

import java.awt.event.KeyEvent;

public class Missile extends GraphicObject {
	boolean launched = false;
	public Missile(String name) {
		
		super(name);
		y=-200;
	}
	public void update() {
		if (launched) {
			y -= 15;
		}
		if (y<-100) {
			launched = false;
		}
	}
	//키보드가 눌러지면 눌러진 키 이벤트 정보와
	//플레이어의 위치 x,y를 갖고 이 메서드를 호출합니다.
	public void keyPressed(KeyEvent event, int x, int y) {
		//만약 스페이스 키가 눌러지면 
		if (event.getKeyCode()==KeyEvent.VK_SPACE) {
			//미사일을 발사시키기 위해 launched에 true를 저장
			launched = true;
			//미사일은 플레이어의 위치에서 발사된다
			//미
			this.x = x;
			this.y = y;
		}
	}

}
