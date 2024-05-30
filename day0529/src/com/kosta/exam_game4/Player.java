package com.kosta.exam_game4;

import java.awt.event.KeyEvent;

public class Player extends GraphicObject {
	//플레이어의 초기 좌표
	public Player(String name) {
		super(name);
		x=150;
		y=350;
	}
	
	//키를 눌렀을 때 이동시키기
	public void keyPressed(KeyEvent event) {
		if (event.getKeyCode()==KeyEvent.VK_LEFT) {
			x-=10;
		}
		if (event.getKeyCode()==KeyEvent.VK_RIGHT) {
			x+=10;
		}
//		if (event.getKeyCode()==KeyEvent.VK_UP) {
//			y-=10;
//		}
//		if (event.getKeyCode()==KeyEvent.VK_DOWN) {
//			y+=10;
//		}
	}
}
