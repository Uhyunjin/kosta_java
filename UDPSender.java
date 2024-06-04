import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*				목적지		데이터
java UDPSender 172.30.1.69 hello?
 */
public class UDPSender {
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket();
			InetAddress addr = InetAddress.getByName(args[0]);
			int port = 9002;
			byte []data = args[1].getBytes();	//문자열을 바이트형의 배열로(패킷이 byte형 배열을 사용)
			DatagramPacket packet
			= new DatagramPacket(data, data.length, addr, port);
			socket.send(packet);	//소켓을 통해서 send
			socket.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
