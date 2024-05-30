package com.kosta.exam_game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	//이미지 파일을 참조하기 위한 변수를 선언
	BufferedImage img = null;
	
	public MyPanel() {
		try {
			img = ImageIO.read(new File("ghost.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
		//내가 그리고 싶은 내용
		g.drawImage(img, 100, 100, null);
		
	}
	

}
