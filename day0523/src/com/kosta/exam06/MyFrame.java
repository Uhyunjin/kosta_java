package com.kosta.exam06;

import java.awt.Frame;

public class MyFrame extends Frame {
	LinePanel lp;
	public MyFrame() {
		lp=new LinePanel();
		//line panel 생성자 동작해서 마우스 이벤트를 받고
		//그래픽 인포 리스트를 초기화한다.
		
		add(lp);
		setSize(400,300);
		setVisible(true);
		System.out.println("생성자동작함");
		
	}
}
