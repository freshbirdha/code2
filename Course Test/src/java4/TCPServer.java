package java4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {//�����
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(8888);
		
		while (true) {
			System.out.println("�ȴ�Զ�����ӣ��˿ں�Ϊ:" + serverSocket.getLocalPort() + "...");
			Socket server = serverSocket.accept();
			System.out.println("Զ��������ַ:" + server.getRemoteSocketAddress());
			
			DataInputStream inputStream = new DataInputStream(server.getInputStream());
			System.out.println(inputStream.readUTF());
			
			DataOutputStream outputStream = new DataOutputStream(server.getOutputStream());
			outputStream.writeUTF("лл������:" + server.getLocalSocketAddress() + "\nGoodbye!");
			
			server.close();
			
		}

	}

}
