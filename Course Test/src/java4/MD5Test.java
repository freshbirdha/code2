package java4;

import java.math.BigInteger;
import java.security.MessageDigest;


public class MD5Test {

	public static void main(String[] args) throws Exception {
		try {
			String string = "���������̽���";
			//����һ��MD5���ܼ���ժҪ
			MessageDigest mDigest = MessageDigest.getInstance("MD5");//�ɻ���"SHA-256"
			//����MD5����
			mDigest.update(string.getBytes());
			
			String md5 = new BigInteger(1,mDigest.digest()).toString(16);
			System.out.println(md5);

			
		} catch (Exception e) {
			throw new RuntimeException("MD5���ܳ��ִ���");
		}
		
	}

}
