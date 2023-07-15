package Main_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class KuaiSuUploadClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("192.168.0.70",22222);
		
		BufferedReader bReader = new BufferedReader(new FileReader("banma.txt"));
		
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		while ((line = bReader.readLine()) != null) {
			bWriter.write(line);
			bWriter.newLine();
			bWriter.flush();
			
		}
		
		bReader.close();
		s.close();
		
	}

}
