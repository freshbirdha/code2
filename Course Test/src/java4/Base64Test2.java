package java4;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Base64Test2 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String encodeString = URLEncoder.encode("°ßÂí±à³Ì","UTF-8");
		System.out.println(encodeString);
		
		
		String decodeString = URLDecoder.decode("%E6%96%91%E9%A9%AC%E7%BC%96%E7%A8%8B","UTF-8");
		System.out.println(decodeString);
		
	}

}
