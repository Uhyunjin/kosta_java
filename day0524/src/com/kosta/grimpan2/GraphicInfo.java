package com.kosta.grimpan2;

import java.awt.Color;
import java.io.Serializable;

//하나의 그래픽에 대한 정보를 표현하기 위한 새로운 클래스를 만들었다.
//지금은 그래픽이 선이기 때문에 선의 정보인 시작점과 끝점으로 구성되는 클래스를 생성
public class GraphicInfo implements Serializable {
	protected int x1;
	protected int x2;
	protected int y1;
	protected int y2;
	protected int drawType;
	protected Color drawColor;
	public Color getDrawColor() {
		return drawColor;
	}
	public void setDrawColor(Color drawColor) {
		this.drawColor = drawColor;
	}
	public GraphicInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GraphicInfo(int x1, int y1, int x2, int y2, int drawType, Color drawColor) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.drawType = drawType;
		this.drawColor = drawColor;
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
}
