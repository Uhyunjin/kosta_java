import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;


class ServerThread extends Thread{
	InputStream is;
	OutputStream os;
	
	public ServerThread( Socket socket ) {		
		try {			
			//연결된 클라이언트와 데이터를 주고받기 위한 입출력 스트림을 생성
			is = socket.getInputStream();
			os = socket.getOutputStream();
		}
		catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}		
	}
	
	//나와 연결된 클라이언트에게 메세지를 보내는 메소드
	public void send(byte []arr) throws Exception{
		os.write(arr);
	}
	
	//연결되어진 모든 클라이언트들에게 메세지를 방송하는 메소드
	public void sendAll(byte []arr) throws Exception{
		for( ServerThread st   : TCPChatServerBroadCastMulti.list) {
			st.send(arr);
		}
	}
	
	public void run() {
		//클라이언트로 부터 수신된 데이터를 받기 위한 배열을 만들어요
		byte []data = new byte[100];
		
		try {
			//연결된 클라이언트와 계속 통신한다.
			while(true) {
				is.read(data);	// 수신된 데이터를 
				sendAll(data);	// 연결된 모든 클라이언트들에게 방송한다.
				String msg = new String(data);
				System.out.println("수신된 데이터==>"+msg);
				Arrays.fill(data, (byte)0);
			}
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
}


public class TCPChatServerBroadCastMulti {	
	
	//연결된 클라이언트를 상대할 ServerThread의 리스트를 선언
	public static ArrayList<ServerThread> list;
	
	public static void main(String[] args) {
			
		//리스트를 생성합니다.
		list = new ArrayList<ServerThread>();
		
		//1. ServerSocket을 생성한다.
		try {
			ServerSocket server = new ServerSocket(9003);
			
			//클라이언트의 접속을 무한대기상태로 기다린다.
			while(true) {
				
				//클라이언트 접속을 수락한다.
				Socket socket = server.accept();
				
				//연결한 클라이언트를 상대하여 계속 통신할 쓰레드를 생성한다.
				ServerThread st = new ServerThread(socket);
				
				//쓰레드를 가동 시킨다.
				st.start();
				
				//리스트에 담아줍니다.
				list.add(st);
				
			}
			
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}		
	}
}