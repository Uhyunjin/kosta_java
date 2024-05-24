package com.kosta.grimpan2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
public class DrawPanel extends Panel implements MouseListener {
	
	ArrayList<GraphicInfo> paintings;
	//클래스의 멤버변수로 리스트 선언
	
	int drawType;	//0:선	1:사각형	2:원
	Color drawColor;
	int cn;
	int x1;
	int x2;
	int y1;
	int y2;
	int width, height;
	

	public DrawPanel(){
		addMouseListener(this);
		paintings = new ArrayList<GraphicInfo>();
	}

	@Override
	public void paint(Graphics g) {
		System.out.println("paint동작");
		
		for (GraphicInfo p : paintings) {
			g.setColor(p.drawColor);
			switch (p.drawType) {
			case 0: g.drawLine(p.getX1(), p.getY1(), p.getX2(), p.getY2()); break;
			case 1: g.drawRect(p.getX1(), p.getY1(), p.getX2(), p.getY2()); break;
			case 2: g.drawOval(p.getX1(), p.getY1(), p.getX2(), p.getY2()); break;		
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스 눌러짐");
		x1 = e.getX();
		y1 = e.getY();

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		switch (drawType) {
		case 0:
			x2 = e.getX();
			y2 = e.getY();
			break;
		case 1:
		case 2:
			x2 = e.getX() - x1;
			y2 = e.getY() - y1;

			if(x2<0) {
				x1 = e.getX();
				x2 *= -1;
			}
			if(y2<0) {
				y1 = e.getY();
				y2 *= -1;
			}
			break;
		}
		
		GraphicInfo newPaint = new GraphicInfo(x1, y1,x2,y2, drawType, drawColor);
		
		paintings.add(newPaint);
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}
