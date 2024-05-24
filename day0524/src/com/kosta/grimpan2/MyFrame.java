package com.kosta.grimpan2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

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
		Menu menu_draw_file = new Menu("file");
		
		//부메뉴 선 사각형 원
		MenuItem draw_line = new MenuItem("line");
		MenuItem draw_Rect = new MenuItem("Rect");
		MenuItem draw_Oval = new MenuItem("Oval");
		
		MenuItem red = new MenuItem("red");
		MenuItem blue = new MenuItem("blue");
		MenuItem green = new MenuItem("green");
		
		MenuItem open_file = new MenuItem("open file");
		MenuItem save_file = new MenuItem("save file");
		
		//주메뉴에 부메뉴 담기
		menu_draw_tool.add(draw_line);
		menu_draw_tool.add(draw_Rect);
		menu_draw_tool.add(draw_Oval);
		
		menu_draw_color.add(red);
		menu_draw_color.add(blue);
		menu_draw_color.add(green);

		menu_draw_file.add(open_file);
		menu_draw_file.add(save_file);
		
		//메뉴바에 주메뉴를 담기
		mb.add(menu_draw_file);
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
		
		//파일 저장에 대한 이벤트 처리
		save_file.addActionListener(new ActionListener() {	//action listener 인터페이스 구현
			@Override
			public void actionPerformed(ActionEvent e) {
				try {	//우리가 그린 그래픽의 모든 정보는 패널의 리스트에 담겨있다
						//그래서 파일로 출력할 내용은 바로 리스트!!!!
						//자바에는 객체단위로 입출력을 위하여 
						//ObjectInputStream과 ObjectOutputStream 클래스가 있다.
						//객체단위의 출력을 위한 ObjectOutputStream 객체를 생성하고
						//생성시에 FileOutStream의 객체를 매개변수로 전달하여
						//생성할 파일의 위치와 이름을 알려준다.
					ObjectOutputStream oos 
					= new ObjectOutputStream(new FileOutputStream("c:/data/bus.pan"));
										
					//ObjectOutStream 객체 oos를 통해서 리스트를 출력
					oos.writeObject(dp.paintings);
					oos.close();
					System.out.println("파일을 저장하였습니다.");
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		//파일 열기에 대한 이벤트 처리
		open_file.addActionListener(new ActionListener() {	//action listener 인터페이스 구현
			@Override
			public void actionPerformed(ActionEvent e) {
				//객체단위로 읽어들이기 위한 ois를 생성합니다.
				try {
					ObjectInputStream ois
					= new ObjectInputStream(new FileInputStream("c:/data/bus.pan"));
					
					//파일로부터 객체를 읽어들여 패널의 리스트에 담기
					dp.paintings = (ArrayList<GraphicInfo>)ois.readObject();
					
					//패널의 리스트에 담긴만큼 그래픽을 그리기 위하여 repaint를 요청
					dp.repaint();
					ois.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		System.out.println("생성자 동작함");
		
	}

}
