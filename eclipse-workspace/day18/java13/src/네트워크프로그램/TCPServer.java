package 네트워크프로그램;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9100);
		System.out.println("승인용 서버 소켓이 시작됨.");
		System.out.println("클라이언트 연결을 기다리는중");
		int count = 0;
		while(true) {
			Socket socket= server.accept(); //Socket
			count++;
			System.out.println(count+">>승인완료! Socket생성됨");
			
		}
		

	}

}
