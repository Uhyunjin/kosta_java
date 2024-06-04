package com.kosta.db;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/*
	자바에서 데이터베이스에 연결하는 프로그램을 만들자
	Java DataBase Connect => JDBC
 */
public class InsertStudent {
	
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;	//finally에서도 알 수 있도록 선언한다.
		
		String sql = "insert into student values('spring',80,90,100)";
		
		try {
			//1.jdbc 드라이버를 메모리로 로드한다
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.DB 서버에 연결한다
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String username="c##madang";
			String password="madang";
			conn = DriverManager.getConnection(url,username,password);
			
			//3.db명령어 실행 담당자 객체를 생성한다
			stmt = conn.createStatement();
			
			//4.실행담당자를 통해서 db명령어를 실행
			int re = stmt.executeUpdate(sql);
			//int의 의미 :  성공적으로 명령을 수행한 건 수
			
			if (re==1) {	//현재 쿼리를 실행하면 반영되는 레코드 수는 1
				System.out.println("레코드 추가 성공!");
			}else {
				System.out.println("실패, re="+re);
			}
			
			//5.사용했던 자원을 닫아준다.
//			stmt.close();
//			conn.close();
			
			
		} catch (Exception e) {
			System.out.println("예외발생 : "+e.getMessage());
		}finally {
			try {	//stmt와 conn이 null이 아니면 닫아준다
				if (stmt != null) {stmt.close();}
				if (conn != null) {conn.close();}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
