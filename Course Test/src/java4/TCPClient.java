package java4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {//服务端
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Socket clientSocket = new Socket("192.168.0.70",8888);
			
			OutputStream outToServer = clientSocket.getOutputStream();
			DataOutputStream outputStream = new DataOutputStream(outToServer);
			
			outputStream.writeUTF("Hello from" + clientSocket.getLocalSocketAddress());
			InputStream inFromServer = clientSocket.getInputStream();
			DataInputStream inputStream  = new DataInputStream(inFromServer);
			System.out.println("服务器响应:" + inputStream.readUTF());
			clientSocket.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	

	}

}
