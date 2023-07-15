package java4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("https://www.google.com");//https://www.ekidata.jp/
			URLConnection connection = url.openConnection();
			
			InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream(),"UTF-8");
			BufferedReader reader = new BufferedReader(inputStreamReader);
			while (reader.ready()) {
				System.out.println(reader.readLine());
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
