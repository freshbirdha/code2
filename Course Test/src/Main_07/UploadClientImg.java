package Main_07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class UploadClientImg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("192.168.0.70",18181);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("log.png"));
		
		BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
		
		byte[] bys = new byte[1024];
		
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys,0,len);
			bos.flush();		
		}
		
		socket.shutdownOutput();
		
		//∂¡»°∑¥¿°
		
		InputStream iStream = socket.getInputStream();
		byte[] bys2 = new byte[1024];
		int len2 = iStream.read(bys2);
		String clientString = new String(bys2,0,len2);
		System.out.println(clientString);
		
		
		bis.close();
		socket.close();
	}

}
