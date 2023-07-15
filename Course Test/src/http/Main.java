package http;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


//import java.net.http.HttpRequest;
public class Main {
	public static final String CRLF = "\r\n";
	public static void main(String[] args) throws IOException {
		System.out.println("服务器启动>>>");
		ServerSocket serverSocket = new ServerSocket(80);
		while (true) {
			Socket socket = serverSocket.accept();
			System.out.println("----收到一个请求------");
			InputStream inputStream = socket.getInputStream();
		/**
		 *  HttpRequest request = new HttpRequest(inputStream);
			System.out.println(request.getHeaderText());
			System.out.println(request.getBodyText());
		 * 	
		 */
			
			
			BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			bWriter.write("HTTP/1.1 200 OK" + CRLF);
			bWriter.write("Content-type: text/html + CRLF");
			bWriter.write(CRLF);
			bWriter.write("<h1>www.banma-school.com</h1>");
			bWriter.flush();
			bWriter.close();
			socket.close();
		
		}

	}

}
