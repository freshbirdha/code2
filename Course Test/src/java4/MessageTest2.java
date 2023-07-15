package java4;

import java.security.GeneralSecurityException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


public class MessageTest2 {
	
	public static void main(String[] args) throws Exception {
		//原文:
		String message = "恩尼格玛";
		System.out.println("明文:" + message);
		
		//64位密钥  = 8 bytes Key:
		byte[] key = "12345678".getBytes("UTF-8");
		
		/**可改成128位密钥 = 16 bytes Key:
		 * byte[] key = "0123456789abcdef".getBytes("UTF-8");
		 */
		
		//加密:
		byte[] data = message.getBytes("UTF-8");
		byte[] encrypted = encrypt(key,data);
		String scString = Base64.getEncoder().encodeToString(encrypted);
		System.out.println("密文:" + scString);
		
		//解密
		
		byte[] decrypted = decrypt(key,encrypted);
		System.out.println("明文:" + new String(decrypted,"UTF-8"));
		
	}

	// 加密
	public static byte[] encrypt(byte[]key,byte[]input) throws GeneralSecurityException {
		Cipher cipher = Cipher.getInstance("DES");
		/**128对称加密算法，传入AES
		 * Cipher cipher = Cipher.getInstance("AES");
		 */
		SecretKey keySpec = new SecretKeySpec(key, "DES");
		cipher.init(Cipher.ENCRYPT_MODE, keySpec);
		return cipher.doFinal(input);
	}
	
	//解密
	public static byte[] decrypt(byte[]key,byte[]input) throws GeneralSecurityException {
		Cipher cipher = Cipher.getInstance("DES");
		SecretKey keySpec = new SecretKeySpec(key, "DES");
		cipher.init(Cipher.DECRYPT_MODE, keySpec);
		return cipher.doFinal(input);
	}
	
	
	
}
