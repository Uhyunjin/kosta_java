package com.kosta.tcp1;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer01 {

	public static void main(String[] args) {
		try {
			//1.소켓을 생성
			ServerSocket server = new ServerSocket();
			System.out.println("통신준비완료");
			//2.클라이언트 접속을 무한대기 상대로 기다리기
			while (true) {
				//4. accept 메서드가 동작하고 통신 수락
				Socket socket = server.accept();
				System.out.println("***** 클라이언트가 연결하였습니다 *****");
				//5.소켓을 통해 stream 생성 (server는 보내기 위한 스트림)
				OutputStream os = socket.getOutputStream();
				
				//난수를 생성해서 stream을 통해 소켓으로 통신(output)
				for (int i = 0; i < 10; i++) {
					Random r = new Random();
					int randomNumber = r.nextInt(100)+1;
					os.write(randomNumber);
					Thread.sleep(200);	//데이터 하나 보낼 때 마다 0.2초 대기
				}
				System.out.println("데이터 전송 완료");
				
				// 7.사용했던 자원을 닫아준다
				os.close();
				socket.close();
			}
		} catch (Exception e) {
			System.out.println("예외발생 : "+e.getMessage());
		}

	}

}
