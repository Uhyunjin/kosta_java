package com.kosta.chat;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;


class ServerThread extends Thread{
	Socket socket;
	InputStream is;
	OutputStream os;
	
	public ServerThread() {	//accept 했을 때 받은 socket을 전해줘서 String을 만든다
		//stream 생성을 서버 쓰레드에게 맡기자		
	}
	
	public void run() {
		
	}
}


public class TCPChatServer {
	
	public static void main(String[] args) {
		byte []data = new byte[100];
		try {
			//1.서버 소켓을 생성한다.
			ServerSocket server = new ServerSocket(9003);
			
			//무한 대기 상태로 클라이언트의 접속을 기다린다
			while (true) {
				//클라이언트의 접속을 수락
				Socket socket = server.accept();
				
				//연결된 클라이언트와 데이터를 주고받기 위한 입출력 스트림 생성
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				//연결된 클라이언트와 계속 통신한다
				while (true) {
					is.read(data);
					os.write(data);
					String msg = new String(data);
					System.out.println("수신된 데이터 : "+msg);
					Arrays.fill(data, (byte)0);
				}
			}
			
		} catch (Exception e) {
			System.out.println("예외 : " + e.getMessage());
		}
	}
}
