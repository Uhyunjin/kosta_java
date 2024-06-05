package com.kosta.exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
 	사용자한테 이름을 입력받아
 	그 이름에 해당하는 학생의 정보를 조회하여
 	출력하는 프로그램을 작성
 */
public class FindStudentByName {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 학생의 이름 : ");
		String name = sc.next();
		String sql = "select * from student where name = '"+name+"'";
		System.out.println(sql);
		ResultSet rs=null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE",
					"c##madang",
					"madang");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int kor = rs.getInt(2);
				int eng = rs.getInt(3);
				int math = rs.getInt(4);
				String res = name+","+kor+","+eng+","+math;
				System.out.println(res);
				
			}
		} catch (Exception e) {
			e.getMessage();
		}finally {
			try {
				if (rs!=null) {
					rs.close();
				}
				if (stmt!=null) {
					stmt.close();
				}
				if (conn!=null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.getMessage();
			}
		}
	}
}
