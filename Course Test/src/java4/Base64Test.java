package java4;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String str = "www.banma-school.com";
			System.out.println("ԭʼ�ַ���:" + str);
			
			//ʹ�û�������
			byte[] buf = str.getBytes("utf-8");
			String base64encodingString = Base64.getEncoder().encodeToString(buf);
			
			System.out.println("Base64�����:" + base64encodingString);
			
			
			//����
			
			byte[] base64decodeBytes = Base64.getDecoder().decode(base64encodingString);
			System.out.println("�����:" + new String(base64decodeBytes,"utf-8"));
			
		} catch (UnsupportedEncodingException e) {
			// TODO: handle exception
			System.out.println("Error:" + e.getMessage());
		}
		
	}

}
