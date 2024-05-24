package com.kosta.grimpan;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame{
	DrawPanel dp;
	public MyFrame() {
		dp=new DrawPanel();
		//line panel 생성자 동작해서 마우스 이벤트를 받고
		//그래픽 인포 리스트를 초기화한다.
		
		add(dp);
		
		//메뉴바 생성
		MenuBar mb = new MenuBar();
		
		//주메뉴 "그리기 도구"를 만듭니다
		Menu menu_draw_tool = new Menu("tool");
		Menu menu_draw_color = new Menu("color");
		
		//부메뉴 선 사각형 원
		MenuItem draw_line = new MenuItem("line");
		MenuItem draw_Rect = new MenuItem("Rect");
		MenuItem draw_Oval = new MenuItem("Oval");
		
		MenuItem red = new MenuItem("red");
		MenuItem blue = new MenuItem("blue");
		MenuItem green = new MenuItem("green");
		
		//주메뉴에 부메뉴 담기
		menu_draw_tool.add(draw_line);
		menu_draw_tool.add(draw_Rect);
		menu_draw_tool.add(draw_Oval);
		
		menu_draw_color.add(red);
		menu_draw_color.add(blue);
		menu_draw_color.add(green);
		
		//메뉴바에 주메뉴를 담기
		mb.add(menu_draw_tool);
		mb.add(menu_draw_color);
		
		//메뉴바를 설정해주는 메서드
		setMenuBar(mb);
		
		
		setSize(400,300);
		setVisible(true);
		
		
		//각각의 메뉴가 눌러졌을때 동작하도록 일을 시킵니다.
		//메뉴 이벤트를 등록한다.
		
		//자바에서는 클래스 안에 클래스를 만들 수 있어요
//		class MyLineEvent implements ActionListener{
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("선그리기를 눌렀어요");
//			}
//		}
//		MyLineEvent me = new MyLineEvent();
//		draw_line.addActionListener(me);
//		draw_line.addActionListener(new MyLineEvent());
//		이렇게 하면 너무 번거롭고.. 어떤 객체가 눌러졌는지 하나씩 판단???
		
		//선 그리기
		draw_line.addActionListener(new ActionListener() {	//action listener 인터페이스 구현
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("선 그리기를 선택하였습니다");
				dp.drawType=0;
			}
		});
		
		//사각형 그리기
		draw_Rect.addActionListener(new ActionListener() {	//action listener 인터페이스 구현
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("사각형 그리기를 선택하였습니다");	
				dp.drawType=1;
			}
		});
		
		//원 그리기
		draw_Oval.addActionListener(new ActionListener() {	//action listener 인터페이스 구현
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("원 그리기를 선택하였습니다");	
				dp.drawType=2;
			}
		});
		
		//빨강
		red.addActionListener(new ActionListener() {	//action listener 인터페이스 구현
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("빨강");	
				dp.drawColor = Color.red;
				dp.cn = 0;
			}
		});
		
		//파랑
		blue.addActionListener(new ActionListener() {	//action listener 인터페이스 구현
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("파랑");	
				dp.drawColor = Color.blue;
				dp.cn = 1;
			}
		});
		
		//초록
		green.addActionListener(new ActionListener() {	//action listener 인터페이스 구현
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("초록");	
				dp.drawColor = Color.green;
				dp.cn = 2;
			}
		});
		
		
		
		
		System.out.println("생성자 동작함");
		
	}

}
