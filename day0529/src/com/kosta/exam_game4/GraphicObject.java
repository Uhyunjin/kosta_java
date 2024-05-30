package com.kosta.exam_game4;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//미래에 만들어질 적, 미사일, 플레이어가 가져야 할 
//공통적인 속성과 동작을 뽑아서 일반화 (부모클래스)
public class GraphicObject {
	//적, 미사일, 플레이어를 나타낼 이미지를 담을 변수
	BufferedImage img = null;
	
	//이미지를 출력할 좌표 x, y
	int x=0,y=0;
	
	//생성자
	//생성시에 이미지 파일명을 매개변수로 전달받아서 이미지 객체 생성
	public GraphicObject(String name) {
		try {
			img = ImageIO.read(new File(name));
		} catch (IOException e) {
			// TODO Auto-generated catch block  
			e.printStackTrace();
		}
	}
	
	//미래에 만들어질 후손 클래스들이 가져야할 공통적인 메서드를 만들어요
	public void update() {}
	public void draw(Graphics g) {
		g.drawImage(img, x, y, null);
	}
	public void keyPressed(KeyEvent event) {}
	
	
	public void clearImage() {
		img = null;
	}
//	public void showImage(String path) {
//        loadImage("");
//    }
}
