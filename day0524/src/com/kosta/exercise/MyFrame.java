package com.kosta.exercise;

import java.awt.Frame;

public class MyFrame extends Frame {
	DrawingPanel dp;
	public MyFrame() {
		dp = new DrawingPanel();
		add(dp);		
		setSize(400,300);
		setVisible(true);
	};

}
