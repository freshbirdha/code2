package java4;

import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.Cipher;

public class RSAUtil {
	
		public static byte[] encrypt(PublicKey pk,byte[] message) throws GeneralSecurityException {
			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, pk);
			return cipher.doFinal(message);
		}
		
		public static byte[] decrypt(PrivateKey pk,byte[] input) throws GeneralSecurityException {
			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.DECRYPT_MODE, pk);
			return cipher.doFinal(input);
		}

		
	}


