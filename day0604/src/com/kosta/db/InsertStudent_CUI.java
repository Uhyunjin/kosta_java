package com.kosta.db;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;

/*
	사용자로부터 이름, 국어, 영어, 수학을 입력받아
	새로운 레코드를 추가하도록 프로그램을 수정해보자
 */
public class InsertStudent_CUI {
	
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;	//finally에서도 알 수 있도록 선언한다.
		
		String name="";
		int kor=0, eng=0, math=0;
		String sql = "insert into student values("+"'"+name+"'"+","+kor+","+eng+","+math+")";
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요 : ");
		name = sc.next();
		System.out.println("국어점수를 입력해주세요 : ");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력해주세요 : ");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력해주세요 : ");
		math = sc.nextInt();
		
		
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
