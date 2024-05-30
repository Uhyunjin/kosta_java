package com.kosta.exam_game3;

import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyPanel panel;
	public MyFrame() {
		panel = new MyPanel();
		add(panel);
		
		//프레임의 배경 색깔을 흰색으로 설정
		setBackground(Color.white);
		
		setSize(400,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
