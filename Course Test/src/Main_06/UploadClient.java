package Main_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UploadClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("192.168.0.70",33333);
		System.out.println("c1");
		BufferedReader bReader = new BufferedReader(new FileReader("banma.txt"));
		
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		System.out.println("c2");
		String line = null;
		while ((line = bReader.readLine()) != null) {
			bWriter.write(line);
			bWriter.newLine();
			bWriter.flush();
			
		}
		System.out.println("c3");
		//Socket提供了一个终止，会通知服务器已经写完了，没有数据再过去了
		socket.shutdownOutput();
		
		
		//接收反馈
		BufferedReader brClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String client = brClient.readLine();
		System.out.println("c4");
		System.out.println(client);
		
		bReader.close();
		socket.close();
		
		
	}

}
