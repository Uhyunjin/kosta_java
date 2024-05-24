package com.kosta.exam05;

import java.awt.Frame;

public class MyFrame extends Frame {
	LinePanel lp;
	public MyFrame() {
		lp=new LinePanel();
		add(lp);
		setSize(400,300);
		setVisible(true);
		System.out.println("생성자동작함");
		
	}
}
