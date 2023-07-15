import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
		    
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	
	    return md5after;
	}
}
