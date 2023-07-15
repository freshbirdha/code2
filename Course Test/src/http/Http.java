package http;

/**
 * ��ȡhttp�����ͷ��
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Http {
	
	public static void main(String[] args) throws IOException {
		System.out.println("����������>>>");
		ServerSocket serverSocket = new ServerSocket(80);
		while (true) {
			Socket socket = serverSocket.accept();
			System.out.println("----�յ�һ������------");
			
			BufferedReader inBufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
			
			String line = inBufferedReader.readLine();
			StringBuilder header = new StringBuilder();
			
			while (line != null && !line.isEmpty()) {
				header.append(line + "\n");
				line = inBufferedReader.readLine();
				
			}
			System.out.println(header);
			socket.close();
		}

	}

}
