package com.kosta.tcpudp;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BasicConnectionClient extends JFrame{
	
	JTextField jtf;
	JTextArea jta;
	
	public BasicConnectionClient() {
		JButton btn = new JButton("전송");
		JPanel p = new JPanel();
		jtf = new JTextField(25);
		p.add(jtf, BorderLayout.CENTER);
		p.add(btn, BorderLayout.EAST);
		
		jta = new JTextArea();
		add(jta, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);
		
		setVisible(true);
		setSize(370,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				byte []data=new byte[200];
				try {
					Socket socket = new Socket("172.30.1.8",9003);
					OutputStream os = socket.getOutputStream();
					data = jtf.getText().getBytes();
					os.write(data);
					InputStream is = socket.getInputStream();
					is.read(data);
					jta.append(new String(data));
					jta.append("\n");
					Arrays.fill(data, (byte)0);
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
	}
	
	public static void main(String[] args) {
		new BasicConnectionClient();
	}

}
