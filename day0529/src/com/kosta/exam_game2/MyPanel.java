package com.kosta.exam_game2;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener{

	//이미지 파일을 참조하기 위한 변수를 선언
	BufferedImage img = null;
	
	public MyPanel() {
		try {
			img = ImageIO.read(new File("player.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		addKeyListener(this);
		
		//패널은 원래 키보드 입력을 받는 용도가 아니기 때문에 바로 동작하지 않는다.
		requestFocus();
		setFocusable(true);
	}
	@Override
	protected void paintComponent(Graphics g) {
		
		//내가 그리고 싶은 내용
		g.drawImage(img, 100, 100, null);
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT:System.out.println("왼쪽");break;
			case KeyEvent.VK_RIGHT:System.out.println("오른쪽");break;
			case KeyEvent.VK_UP:System.out.println("위");break;
			case KeyEvent.VK_DOWN:System.out.println("아래");break;
			case KeyEvent.VK_SPACE:System.out.println("스페이스");break;
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
