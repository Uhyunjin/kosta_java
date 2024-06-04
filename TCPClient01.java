import java.io.InputStream;
import java.net.Socket;

public class TCPClient01 {

	public static void main(String[] args) {
		try {
			//3. socket 객체를 생성하고 통신요청
			// socket을 만드는 거 자체로 통신을 요청하는 것
			Socket socket = new Socket("172.30.1.8",9001);
			//5. socket을 통해 stream 생성(server는 받기만 하는 stream)
			InputStream is = socket.getInputStream();
			for (int i = 0; i < 10; i++) {
				int n = is.read();
				System.out.println("서버로부터 수신된 데이터 : "+n);
			}
			// 7.사용했던 자원을 닫아준다
			is.close();
			socket.close();
			
		} catch (Exception e) {
			System.out.println("예외발생 : "+e.getMessage());
		}

	}

}
