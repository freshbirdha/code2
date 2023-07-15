import java.security.MessageDigest;

import javax.xml.bind.DatatypeConverter;

public class MD5Util {
	public static String getMD5(String str) {
		String md5after = null;

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			byte[] digest = md.digest();
			String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
			md5after = myHash;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return md5after;

	}
}
