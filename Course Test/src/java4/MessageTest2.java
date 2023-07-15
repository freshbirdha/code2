package java4;

import java.security.GeneralSecurityException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


public class MessageTest2 {
	
	public static void main(String[] args) throws Exception {
		//ԭ��:
		String message = "�������";
		System.out.println("����:" + message);
		
		//64λ��Կ  = 8 bytes Key:
		byte[] key = "12345678".getBytes("UTF-8");
		
		/**�ɸĳ�128λ��Կ = 16 bytes Key:
		 * byte[] key = "0123456789abcdef".getBytes("UTF-8");
		 */
		
		//����:
		byte[] data = message.getBytes("UTF-8");
		byte[] encrypted = encrypt(key,data);
		String scString = Base64.getEncoder().encodeToString(encrypted);
		System.out.println("����:" + scString);
		
		//����
		
		byte[] decrypted = decrypt(key,encrypted);
		System.out.println("����:" + new String(decrypted,"UTF-8"));
		
	}

	// ����
	public static byte[] encrypt(byte[]key,byte[]input) throws GeneralSecurityException {
		Cipher cipher = Cipher.getInstance("DES");
		/**128�ԳƼ����㷨������AES
		 * Cipher cipher = Cipher.getInstance("AES");
		 */
		SecretKey keySpec = new SecretKeySpec(key, "DES");
		cipher.init(Cipher.ENCRYPT_MODE, keySpec);
		return cipher.doFinal(input);
	}
	
	//����
	public static byte[] decrypt(byte[]key,byte[]input) throws GeneralSecurityException {
		Cipher cipher = Cipher.getInstance("DES");
		SecretKey keySpec = new SecretKeySpec(key, "DES");
		cipher.init(Cipher.DECRYPT_MODE, keySpec);
		return cipher.doFinal(input);
	}
	
	
	
}
