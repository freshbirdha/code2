package Main_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("192.168.0.70",23456);
		
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		String lineString = null;
		
		while ((lineString = bReader.readLine()) != null) {
			if("over".equals(lineString)) {
				break;
			}
			bWriter.write(lineString);
			bWriter.newLine();//每次写完换行
			bWriter.flush();//刷新		
		}
		
		bWriter.close();
		
	}

}
