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
		
		//��ȡ�����
		OutputStream oStream = socket.getOutputStream();
		oStream.write("���������̽���".getBytes());
		
		//��ȡ������
		InputStream iStream = socket.getInputStream();
		byte[] bys = new byte[1024];
		int len = iStream.read(bys);//����
		String clientString = new String(bys,0,len);
		System.out.println("client:" + clientString);
		
		socket.close();
	}

}
