package service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.OutputStream;

import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(18181);
		
		Socket socket = serverSocket.accept();
		
		BufferedInputStream biStream = new BufferedInputStream(socket.getInputStream());
		
		BufferedOutputStream boStream = new BufferedOutputStream(new FileOutputStream("log.png"));
		
		byte [] bys = new byte[1024];
		
		int len = 0;
		while ((len = biStream.read(bys)) != -1) {
			boStream.write(bys,0,len);
			boStream.flush();
			
		}
		
		OutputStream oStream = socket.getOutputStream();
		oStream.write("upload succced".getBytes());
		
		boStream.close();
		socket.close();
	}
	
	

}
