package Main_07;


import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UploadClientImg3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("192.168.0.70",21111);
		
		System.out.println("�ͻ���("+Thread.currentThread().hashCode()+")��ʼ�����ļ�����");
		
		//��װ�ļ�
		BufferedReader bReader = new BufferedReader(new FileReader("log.png"));
		
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		String line = null;
		
		while ((line = bReader.readLine()) != null) {
			bWriter.write(line);
			bWriter.newLine();
			bWriter.flush();
			
		}
		socket.shutdownOutput();
		
		BufferedReader brClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String client = brClient.readLine();
	
		System.out.println(client);
		
		System.out.println("�ͻ���("+Thread.currentThread().hashCode()+")�����ļ���ϣ���");
		
		bReader.close();
		socket.close();

	}

}
