package com.kosta.exercise;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingPanel extends Panel implements MouseListener{
	int x1, x2, y1, y2;
	
	public DrawingPanel() {
		addMouseListener(this);
		
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(10, 10, 110, 10);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	};
	
	

}
