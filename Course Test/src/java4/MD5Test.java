package java4;

import java.math.BigInteger;
import java.security.MessageDigest;


public class MD5Test {

	public static void main(String[] args) throws Exception {
		try {
			String string = "东京斑马编程教室";
			//生成一个MD5加密计算摘要
			MessageDigest mDigest = MessageDigest.getInstance("MD5");//可换成"SHA-256"
			//计算MD5函数
			mDigest.update(string.getBytes());
			
			String md5 = new BigInteger(1,mDigest.digest()).toString(16);
			System.out.println(md5);

			
		} catch (Exception e) {
			throw new RuntimeException("MD5加密出现错误");
		}
		
	}

}
