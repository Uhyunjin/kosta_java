package com.kosta.exam1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import oracle.net.nt.ConnectDescription;

public class InsertGUITest extends JFrame{
	
	JTextField jtf_name;
	JTextField jtf_kor;
	JTextField jtf_eng;
	JTextField jtf_math;
	JButton btn;
	
	public InsertGUITest() {
		jtf_name = new JTextField(20);
		jtf_kor = new JTextField(20);
		jtf_eng = new JTextField(20);
		jtf_math = new JTextField(20);
		btn = new JButton("입력");
		
		
		setLayout(new FlowLayout());
		add(new JLabel("이름"));
		add(jtf_name);
		add(new JLabel("국어"));
		add(jtf_kor);
		add(new JLabel("영어"));
		add(jtf_eng);
		add(new JLabel("수학"));
		add(jtf_math);
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Connection conn=null;
				Statement stmt=null;				
				String name=jtf_name.getText();
				int kor = Integer.parseInt(jtf_kor.getText());
				int eng = Integer.parseInt(jtf_eng.getText());
				int math = Integer.parseInt(jtf_math.getText());
				
				try {
					String sql = "insert into student values('"+name+"',"+kor+","+eng+","+math+")";
			
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@localhost:1521:XE";
					String username="c##madang";
					String password="madang";
					
					conn = DriverManager.getConnection(url,username,password);
					stmt = conn.createStatement();
					
					int re = stmt.executeUpdate(sql);
					
					if (re==1) {
						System.out.println(sql+" 성공");
					}else {
						System.out.println("실패");
					}
					
					
				} catch (Exception e2) {
					
				}finally {
					try {
						if (stmt!=null) {
							stmt.close();
						}
						if (conn!=null) {
							conn.close();
						}
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}		
			}
		});
		
		setVisible(true);
		setSize(300,180);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new InsertGUITest();

	}

}
