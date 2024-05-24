package com.kosta.exam04;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
public class LinePanel extends Panel implements MouseListener {
	
	ArrayList<GraphicInfo> paintings;
	//클래스의 멤버변수로 리스트 선언
	
	int x1;
	int x2;
	int y1;
	int y2;
	int width, height;

	public LinePanel(){
		addMouseListener(this);
		paintings = new ArrayList<GraphicInfo>();
	}

	@Override
	public void paint(Graphics g) {
		System.out.println("paint동작");
		for (GraphicInfo p : paintings) {
//			g.drawLine(p.getX1(), p.getX2(), p.getY1(), p.getY2());
			g.drawOval(p.getX1(), p.getY1(), p.getX2(), p.getY2());
			g.drawRect(p.getX1(), p.getY1(), p.getX2(), p.getY2());
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
		x2 = e.getX();
		y2 = e.getY();
		width = x2-x1;
		height = y2-y1;
		
		if(width<0) {
			x1 = x2;
			width *= -1;
		}
		if(height<0) {
			y1 = y2;
			height *= -1;
		}
		
		GraphicInfo newPaint = new GraphicInfo(x1, y1,width,height);
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
