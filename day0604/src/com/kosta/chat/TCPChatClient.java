package com.kosta.chat;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TCPChatClient extends JFrame{
	
	JTextArea jta;
	JTextField jtf;
	
	//클라이언트의 멤버변수 소켓, 인풋스트림, 아웃풋스트림 선언
	Socket socket;
	InputStream is;
	OutputStream os;
	
	public TCPChatClient() {
		
		try {
			//1.서버와 통신하기 위한 소켓을 생성한다
			socket = new Socket("172.30.1.8",9003);
			//생성된 소켓을 통해 입출력 스트림을 생성한다.
			is = socket.getInputStream();
			os = socket.getOutputStream();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jta = new JTextArea();
		jtf = new JTextField(300);
		JScrollPane jsp = new JScrollPane(jta);
		JButton btnSend = new JButton("전송");
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(jtf, BorderLayout.CENTER);
		p.add(btnSend, BorderLayout.EAST);
		
		add(jsp, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);
		
		
		//서버로부터 수신된 데이터를 계속하여 받기 위한 쓰레드 만들기
		class ClientThread extends Thread{
			byte []data = new byte[200];
			@Override
			public void run() {
				while (true) {
					try {
						is.read(data);
						jta.append(new String(data));
						jta.append(new String("/n"));
						
						Arrays.fill(data, (byte)0);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
				}
			}
		}
		ClientThread ct = new ClientThread();
		ct.start();
		
		
		
		//전송버튼 이벤트
		btnSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//전송버튼을 눌렀을 때 os를 통해 데이터 출력
				//보낼 데이터를 바이트형의 배열로 만든다
				byte []data = jtf.getText().getBytes();
				try {
					os.write(data);
				} catch (Exception e2) {
					System.out.println("예외발생 : "+e2.getMessage());
				}
			}
		});
		
		setSize(300,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new TCPChatClient();
	}

}
