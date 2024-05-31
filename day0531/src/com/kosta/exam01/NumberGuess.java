package com.kosta.exam01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NumberGuess extends JFrame {
	
	JTextField jtf_input;
	JLabel jlb_result;
	JLabel jlb_cnt;
	
	int user;
	int computer;
	int cnt=1;
	//멤버변수는 자동적으로 처음에 0으로 초기화된다

	public NumberGuess() throws HeadlessException {
		//난수는 생성시에 딱 하나만 가져온다!
		computer = new Random().nextInt(100)+1;
		
		setTitle("숫자 게임");
		setLayout(new FlowLayout());
		
		//텍스트 필드와 라벨
		jtf_input = new JTextField(8);	//텍스트 단위
		add(new JLabel("숫자를 추측하세요"));
		add(jtf_input);
		jlb_result  = new JLabel("이곳에 결과가 나옵니다");
		add(jlb_result);
		jlb_cnt = new JLabel(cnt+"번째 시도입니다.");
		
		
		//버튼 만들기
		JButton btnOK = new JButton("  다시 한번  ");
		JButton btnExit = new JButton("     종료     ");
		
		//색깔 설정하기
		jtf_input.setBackground(new Color(242,230,208));
		btnOK.setBackground(new Color(96,147,191));
		btnExit.setBackground(new Color(96,147,191));
		
		//라벨의 배경색을 설정하기 위해서는 불투명하게 만들어야한다.
		jlb_result.setOpaque(true);
		jlb_result.setBackground(new Color(242,230,208));	//라벨은 기본적으로 배경이 투명!
		
		getContentPane().setBackground(new Color(242,230,208));
		
		
		add(btnOK);
		add(btnExit);
		add(jlb_cnt);
		
		
		setSize(250,150);
		setVisible(true);
		setResizable(false);	// 크기 조절 제한
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//사용자가 입력한 숫자를 가져와서 콘솔에 출력
				user = Integer.parseInt(jtf_input.getText());
//				System.out.println("사용자 : "+user);
//				System.out.println("컴퓨터 : "+computer);
				String res = "            정답입니다~!            ";
				if (user<computer) {
					res = "            너무 낮습니다!           ";
				}else if (user>computer) {
					res = "            너무 높습니다!            ";
				}
				if (user==computer) {
					jlb_result.setBackground(new Color(96,147,191));
				}else {					
					jlb_result.setBackground(new Color(154,193,217));
				}
				cnt++;
				jlb_result.setText(res);
				jlb_cnt.setText(cnt+"번째 시도입니다");
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
								
			}
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NumberGuess();
	}

}
