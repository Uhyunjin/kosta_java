package com.kosta.exam2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class StudentTest extends JFrame {
	JTextField jtf_name;
	JTextField jtf_kor;
	JTextField jtf_eng;
	JTextField jtf_math;
	JButton btnInsert;
	JButton btnUpdate;
	JButton btnDelete;
	
	Vector<String> colName;
	Vector<Vector<String>> rowData;
	JTable table;
	String sql;
	
	//모든 학생의 목록을 읽어와서 JTable에 출력하는 메서드
	public void loadStudent() {
		StudentDAO dao = new StudentDAO();
		ArrayList<StudentVO> list = dao.listStudent();
		System.out.println(list);
	}

	
	public StudentTest() {
		jtf_name = new JTextField(10);
		jtf_kor = new JTextField(10);
		jtf_eng = new JTextField(10);
		jtf_math = new JTextField(10);
		btnInsert = new JButton("입력");
		btnUpdate = new JButton("수정");
		btnDelete = new JButton("삭제");
		
		JPanel p1 = new JPanel();
		p1.add(new JLabel("이름"));
		p1.add(jtf_name);
		p1.add(new JLabel("국어"));
		p1.add(jtf_kor);
		p1.add(new JLabel("영어"));
		p1.add(jtf_eng);
		p1.add(new JLabel("수학"));
		p1.add(jtf_math);
		p1.add(btnInsert);
		p1.add(btnUpdate);
		p1.add(btnDelete);
		
		colName = new Vector<String>();
		colName.add("이름");
		colName.add("국어");
		colName.add("영어");
		colName.add("수학");
		rowData = new Vector<Vector<String>>();
		table = new JTable(rowData, colName);
		
		JScrollPane jsp = new JScrollPane(table);

		add(p1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		loadStudent();
	
		setVisible(true);
		setSize(850,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
		btnInsert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				int kor = Integer.parseInt(jtf_kor.getText());
				int eng = Integer.parseInt(jtf_eng.getText());
				int math = Integer.parseInt(jtf_math.getText());
				
				//DAO 객체를 만들어 그 안에 있는 method를 사용하기 위해서
				//매개변수로 넘겨 줄 studentVO 객체를 만든다.
				StudentVO student = new StudentVO(name, kor, eng, math);
				StudentDAO dao = new StudentDAO();
				int re = dao.insertStudent(student);
				
				if (re==1) {JOptionPane.showMessageDialog(null, "학생의 정보를 추가하였습니다");}
				else {JOptionPane.showMessageDialog(null, "실패하였습니다");}
			}
		});
		
	}
	
	public static void main(String[] args) {
		new StudentTest();
	}
}
