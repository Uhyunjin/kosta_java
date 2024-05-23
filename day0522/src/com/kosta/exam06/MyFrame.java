package com.kosta.exam06;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

class MyFrame extends Frame implements MouseListener{

	public MyFrame(String title) {
		super(title);
		setSize(400,200);
		setVisible(true);
		
		//마우스 일처리 담당자를 등록합니다
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스 누름");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스 뗌");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스 들어감");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스 나감");
	}
	
	
	public static void main(String[] args) {
		new MyFrame("마이 프레임");
		//메인에서 객체를 참조할일이 있다면 변수를 만드는건데 안만들어도 됌
	}
}
