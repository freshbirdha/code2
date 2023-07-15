package Main_02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		// 监听客户端的连接
		ServerSocket ss = new ServerSocket(9999);
		
		Socket socket = ss.accept();
		
		InputStream iStream = socket.getInputStream();
		byte[] bys = new byte[1024];
		int len = iStream.read(bys);
		
		String serverString = new String(bys,0,len);
		
		System.out.println("server:" + serverString);
		
		OutputStream oStream = socket.getOutputStream();
		
		oStream.write("recived".getBytes());
		
		socket.close();

	}

}
