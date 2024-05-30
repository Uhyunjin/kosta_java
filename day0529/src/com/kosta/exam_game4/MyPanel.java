package com.kosta.exam_game4;

import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener {
	
	Enemy enemy;
	Player player;
	Missile missile;
	
	
	public MyPanel() {
		super();
		this.addKeyListener(this);
		this.requestFocus();
		setFocusable(true);
		
		enemy = new Enemy("enemy.png");
		player = new Player("ghost.png");
		missile = new Missile("missile.png");
		
		//inner Thread
		//클래스 안의 클래스
		//적, 미사일, 플레이어가 제각각 동시다발적으로 움직이도록 하기 위하여
		//Thread를 만든다
		//이것은 다른곳에서는 쓸 일이 없기 때문에
		//MyPanel안에 만들어준다
		class MyThread extends Thread{
			public void run() {
				while(true) {
					enemy.update();
					player.update();
					missile.update();
					//inner class는 outer class의 멤버처럼 작동한다
					//그래서 outer class의 메서드를 자유롭게 사용한다
					if ((missile.y>0&&missile.y<30) &&(missile.x<(enemy.x+30)&&missile.x>(enemy.x-30))) {
						enemy.clearImage();
						player.clearImage();
						missile.clearImage();
						repaint();
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						enemy = new Enemy("enemy.png");
						player = new Player("ghost.png");
						missile = new Missile("missile.png");
					}
					repaint(); 
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO: handle exception
					}
				}
			}		
		}
		
		Thread t = new MyThread();
		t.start();
	}//end MyPenel Constructor
	
	//쓰레드에ㅓ 각각의 그래픽 오브젝트의 위치를 변경시킨후
	//다시 그려줄것을 요청(repaint)하면 다음의 paintComponent가 동작
	//이 메서드에서는 각각의 그래픽 오브젝트의 draw()를 호출
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		enemy.draw(g);
		player.draw(g);
		missile.draw(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		player.keyPressed(e);
		missile.keyPressed(e, player.x, player.y);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	
}
