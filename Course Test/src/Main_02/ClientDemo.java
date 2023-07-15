package Main_02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientDemo {
//TCP
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("192.168.0.70",9999);
		
		//获取输出流
		OutputStream oStream = socket.getOutputStream();
		oStream.write("东京斑马编程教室".getBytes());
		
		//获取输入流
		InputStream iStream = socket.getInputStream();
		byte[] bys = new byte[1024];
		int len = iStream.read(bys);//阻塞
		String clientString = new String(bys,0,len);
		System.out.println("client:" + clientString);
		
		socket.close();
	}

}
