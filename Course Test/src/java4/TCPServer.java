package java4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {//服务端
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(8888);
		
		while (true) {
			System.out.println("等待远程连接，端口号为:" + serverSocket.getLocalPort() + "...");
			Socket server = serverSocket.accept();
			System.out.println("远程主机地址:" + server.getRemoteSocketAddress());
			
			DataInputStream inputStream = new DataInputStream(server.getInputStream());
			System.out.println(inputStream.readUTF());
			
			DataOutputStream outputStream = new DataOutputStream(server.getOutputStream());
			outputStream.writeUTF("谢谢连接我:" + server.getLocalSocketAddress() + "\nGoodbye!");
			
			server.close();
			
		}

	}

}
