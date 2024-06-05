package com.kosta.exam1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Statement;
import java.util.Vector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import oracle.net.nt.ConnectDescription;

public class InsertSelectGUI2 extends JFrame{
	
	JTextField jtf_name;
	JTextField jtf_kor;
	JTextField jtf_eng;
	JTextField jtf_math;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	
	Vector<String> colName;
	Vector<Vector<String>> rowData;
	JTable table;
	String sql;
	
	public static final String driver="oracle.jdbc.driver.OracleDriver";
	public static final String url="jdbc:oracle:thin:@localhost:1521:XE";
	public static final String username="c##madang";
	public static final String password="madang";
	
	public void loadStudent() {
		String sql = "select * from student";
		
		Connection conn=null;
		Statement stmt = null;
		ResultSet rs = null;
		rowData.clear();
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				Vector<String> row = new Vector<String>();
				String name = rs.getString(1);
				String kor= Integer.toString(rs.getInt(2));
				String eng= Integer.toString(rs.getInt(3));
				String math= Integer.toString(rs.getInt(4));

				row.add(name);
				row.add(kor);
				row.add(eng);
				row.add(math);
				
				rowData.add(row);
			}
			table.updateUI();
			
		} catch (Exception e1) {
			// TODO: handle exception
		}finally {
			try {
				if (rs!=null) {rs.close();}
				if (stmt!=null) {stmt.close();}
				if (conn!=null) {conn.close();}
			} catch (Exception e2) {
				System.out.println("예외발생 : " + e2.getMessage());
			}
		}
	}
	
	public InsertSelectGUI2() {
		jtf_name = new JTextField(10);
		jtf_kor = new JTextField(10);
		jtf_eng = new JTextField(10);
		jtf_math = new JTextField(10);
		btn1 = new JButton("입력");
		btn2 = new JButton("수정");
		btn3 = new JButton("삭제");
		
		JPanel p1 = new JPanel();
		p1.add(new JLabel("이름"));
		p1.add(jtf_name);
		p1.add(new JLabel("국어"));
		p1.add(jtf_kor);
		p1.add(new JLabel("영어"));
		p1.add(jtf_eng);
		p1.add(new JLabel("수학"));
		p1.add(jtf_math);
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		
		colName = new Vector<String>();
		colName.add("이름");
		colName.add("국어");
		colName.add("영어");
		colName.add("수학");
		rowData = new Vector<Vector<String>>();
		table = new JTable(rowData, colName);
		
//		JPanel p2 = new JPanel();
		JScrollPane jsp = new JScrollPane(table);
//		p2.add(jsp, BorderLayout.CENTER);

		add(p1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
				
		
		//버튼을 누르면 입력 후 다시 테이블 새로고침
		btn1.addActionListener(new ActionListener() {
			
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
					Class.forName(driver);
					conn = DriverManager.getConnection(url,username,password);
					stmt = conn.createStatement();
					
					int re = stmt.executeUpdate(sql);
					
					if (re==1) {
						System.out.println(sql+" 성공");
						loadStudent();
					}else {
						System.out.println("실패");
					}
					
					
				} catch (Exception e2) {
					
				}finally {
					try {
						if (stmt!=null) {stmt.close();}
						if (conn!=null) {conn.close();}
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
				
			}
		});
		
		//테이블에서 선택한 레코드 jtf에 불러오기!
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				int index = table.getSelectedRow();
				Vector<String>row = rowData.get(index);
				String selectedName = row.get(0);
				System.out.println(selectedName);
				
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				sql = "select * from student where name = '"+selectedName+"'";
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url,username,password);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					
					if (rs.next()) {
						jtf_name.setText(rs.getString(1));
						jtf_kor.setText(rs.getInt(2)+"");
						jtf_eng.setText(rs.getInt(3)+"");
						jtf_math.setText(rs.getInt(4)+"");
						
					}
				} catch (Exception e2) {
					e2.getMessage();
				}finally {
					try {
						if (rs!=null) {rs.close();}
						if (stmt!=null) {stmt.close();}
						if (conn!=null) {conn.close();}
					} catch (Exception e2) {
						System.out.println("예외발생 : " + e2.getMessage());
					}
				}
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		// 생성자에서 테이블 조회해서 가져오기
		loadStudent();
		
		setVisible(true);
		setSize(850,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new InsertSelectGUI2();

	}

}
