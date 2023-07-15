package Main_01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//TCP协议的封装
		Socket socket = new Socket("192.168.0.70",8888); 
		
		OutputStream oStream = socket.getOutputStream();
		oStream.write("hello,TCP".getBytes());
		
		socket.close();

	}

}
