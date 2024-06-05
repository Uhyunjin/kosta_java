package com.kosta.tcpudp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BasicConnectionServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9002);
			byte[]data = new byte[100];
			while (true) {
				Socket socket = server.accept();
				InputStream is = socket.getInputStream();
				is.read(data);
				System.out.println(new String(data));
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
