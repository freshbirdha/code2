package java4;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String str = "www.banma-school.com";
			System.out.println("原始字符串:" + str);
			
			//使用基本编码
			byte[] buf = str.getBytes("utf-8");
			String base64encodingString = Base64.getEncoder().encodeToString(buf);
			
			System.out.println("Base64编码后:" + base64encodingString);
			
			
			//解码
			
			byte[] base64decodeBytes = Base64.getDecoder().decode(base64encodingString);
			System.out.println("解码后:" + new String(base64decodeBytes,"utf-8"));
			
		} catch (UnsupportedEncodingException e) {
			// TODO: handle exception
			System.out.println("Error:" + e.getMessage());
		}
		
	}

}
