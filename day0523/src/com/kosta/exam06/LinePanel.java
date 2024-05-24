package com.kosta.exam06;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

//복잡한 화면 구성을 위한 서브컨테이너 역할이나
//그래픽을 표현하기 위하여 사용하는 화면구성요소
//아래의 라인패널은 그래픽을 표현하기 위하여 패널 클래스로부터 상속받고
//마우스 움직임에 대한 이벤트 처리를 위하여 마우스리스터 인터페이스를 구현하도록 한다.
public class LinePanel extends Panel implements MouseListener {
	
	//선을 그리면 이전에 그렸던 선은 사라진다
	//그려진 모든 선을 저장하기 위해서는
	//선을 그릴때마다 리스트에 담아두고 paint 메서드에서
	//리스트에 담긴 요소만큼 모두 다시 그려주도록 만든다
	
	ArrayList<GraphicInfo> paintings;
	//화면에 그려진 모든 그래픽(선)을 담기 위하여 리스트 선언
	//리스트에는 그래픽의 정보를 표현하기 위한 그래픽인포만 담도록 한정한다
	int x1;
	int x2;
	int y1;
	int y2;
	int height, width;
	
	//현재의 그래픽(선)의 시작점과 끝점
	
	public LinePanel(){ //객체 생성시 자동동작
		// 현재 패널이 마우스이벤트 처리 담당자가 됨
		addMouseListener(this);
		paintings = new ArrayList<GraphicInfo>();
	}
	
	
	//윈도우 프로그래밍에서는 화면을 다시 그려줘야 할 필요가 있으면
	//다음의 paint 메서드가 자동으로 동작한다
	//처음 linepanel을 생성하여 프레임에 담으면 이 paint 메서드가 자동으로 동작하고
	//또 프레임의 크기를 조절하면 그 속에 있는 패널의 크기도 ㅂㄴ경되기 때문에
	//그때도 paint가 자동으로 동작한다
	//무언가 다시 그려줘야 할 필요가 있을때 paint가 자동으로 동작한다
	//그러나 원래 윈도는 모르는 사항에 대해서 다시 그려줄것을 요청하려면
	//repaint()메서드를 직접 사용해준다
	
	@Override
	public void paint(Graphics g) {
		System.out.println("paint동작");
		for (GraphicInfo p : paintings) {
			g.drawRect(p.getX1(), p.getY1(), p.getX2(),  p.getY2());
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
		
		if (width<0) {
			x1=x2;
			width*=-1;
		}
		
		if (height<0) {
			y1=y2;
			height*=-1;
		}
		
		GraphicInfo newPaint = new GraphicInfo(x1, y1, width, height);
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
