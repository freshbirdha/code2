package http;

/**
 * 获取http请求的头部
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

import com.sun.net.ssl.HttpsURLConnection;

public class Http2 {
	
	public static void main(String[] args) throws IOException {
		String urlString = "https://thhpbin.org/post";
		String bodyString="password=e10adc3949ba59abbe56e57f20f883e&amp;username=test3";
		
		
		URL url = new URL(urlString);
		HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();
		connection.setRequestMethod("POST");
		connection.setDoOutput(true);
		
		OutputStream oStream = connection.getOutputStream();
		oStream.write(bodyString.getBytes("UTF-8"));
		oStream.flush();
		oStream.close();
		
		if(connection.getResponseCode()== HttpsURLConnection.HTTP_OK) {
			InputStream iStream = connection.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(iStream));
			StringBuilder sBuilder = new StringBuilder();
			String lineString;
			while ((lineString = reader.readLine())!=null) {
				sBuilder.append(lineString);
				
			}
			System.out.println("rsp:" + sBuilder.toString());
		}else {
			System.out.println("rsp code:" + connection.getResponseCode());
		}
		

	}

}
