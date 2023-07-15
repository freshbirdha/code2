package Main_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(34567);
		
		Socket socket = serverSocket.accept();
		
		BufferedReader bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String line = null;
		while ((line = bReader.readLine()) != null) {
			System.out.println(line);
			
		}
		
		socket.close();
	}

}
