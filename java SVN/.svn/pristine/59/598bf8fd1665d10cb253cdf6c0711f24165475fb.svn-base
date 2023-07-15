package test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class Test01 {
	public static void main(String[] args) throws NoSuchAlgorithmException {
			//900150983CD24FB0D6963F7D28E17F72
			//E2FC714C4727EE9395F324CD2E7F331F  == abcd
			// abcd   ==   E2FC714C4727EE9395F324CD2E7F331F
		
		    String password = "abcd";
		         
		    MessageDigest md = MessageDigest.getInstance("MD5");
		    md.update(password.getBytes());
		    byte[] digest = md.digest();
		    String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
		    System.out.println(myHash);
		    System.out.println(myHash.getBytes().length);
	}
}
