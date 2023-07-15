package Main_01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServiceDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ServerSocket serverSocket = new ServerSocket(8888);
		
		Socket socket = serverSocket.accept();
		
		InputStream iStream = socket.getInputStream();
		
		byte[] bys = new byte[1024];
		int len = iStream.read(bys);
		
		String string = new String(bys,0,len);
		
		String ipString = socket.getInetAddress().getHostAddress();
		
		System.out.println(ipString + "----" + string);

	}

}
