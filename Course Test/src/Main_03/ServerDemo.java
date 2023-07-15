package Main_03;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		
				ServerSocket ss = new ServerSocket(19999);
				
				Socket socket = ss.accept();
				
				//包装通道内容的流
				InputStreamReader iStreamReader = new InputStreamReader(socket.getInputStream());
				
				BufferedReader bReader = new BufferedReader(iStreamReader);
				
				String lineString = null;
				while ((lineString = bReader.readLine()) != null) {
					System.out.println(lineString);
					
				}
						
				socket.close();
		
	}

}
