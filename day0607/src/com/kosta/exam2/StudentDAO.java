package com.kosta.exam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {

	public final static String driver = "oracle.jdbc.driver.OracleDriver";
	public final static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	public final static String username = "c##madang";
	public final static String password = "madang";
	
	Connection conn=null;
	Statement stmt=null;
	
	String sql;
	
	String name;
	int kor, eng, math;
	
	//insert 새로운 학생 추가 메서드
	public int insertStudent(StudentVO student) {
		int re=-1;
		
		name=student.getName();
		kor=student.getKor();
		eng=student.getEng();
		math=student.getMath();
		
		sql = "insert into student values('"+name+"',"+kor+","+eng+","+math+")";
		System.out.println(sql);
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,username,password);
			stmt=conn.createStatement();
			re = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt!=null) {stmt.close();}
				if (conn!=null) {conn.close();}
			} catch (Exception e2) {e2.getMessage();}
		}

		return re;
	}
	
	//모든 학생에 대한 정보를 조회하여 ArrayList로 반환하는 메서드 만들기
	public ArrayList<StudentVO> listStudent() {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		sql = "select * from student";
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				list.add(new StudentVO(rs.getString(1),
										rs.getInt(2),
										rs.getInt(3),
										rs.getInt(4)));
			}
			
		} catch (Exception e) {
			e.getMessage();
		} finally {
			try {
				if (rs!=null) {rs.close();}
				if (stmt!=null) {stmt.close();}
				if (conn!=null) {conn.close();}
			} catch (Exception e2) {e2.getMessage();}
		}
		return list;
	}
}
