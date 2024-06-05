package com.kosta.tcpudp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class BasicConnectionServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9003);
			byte[]data = new byte[100];
			while (true) {
				Socket socket = server.accept();
				InputStream is = socket.getInputStream();
				is.read(data);
				System.out.println(new String(data));
				OutputStream os = socket.getOutputStream();
				os.write(data);
				Arrays.fill(data, (byte)0);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
