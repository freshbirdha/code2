package java4;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;


public class MessageTest {
	
	public static void main(String[] args) {

		
	}

	
	
	public static String getMd5(File file) {
		
		FileInputStream fis = null;
		
		try {
			
			//生成一个MD5加密计算摘要
			MessageDigest mDigest = MessageDigest.getInstance("MD5");//可换成"SHA-256"
			fis= new FileInputStream(file);
			byte[] buffer = new byte[2048];
			
			int length = -1;
			
			while((length = fis.read(buffer))!= -1) {
				mDigest.update(buffer,0,length);
			}
		
			return new BigInteger(1,mDigest.digest()).toString(16);
	
		
		} catch (Exception e) {
				throw new RuntimeException("MD5加密出现错误");
			}
		
	}

}
