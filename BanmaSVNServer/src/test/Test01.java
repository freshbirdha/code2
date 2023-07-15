package test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class Test01 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
	
		    String password = "abc";
		         
		    MessageDigest md = MessageDigest.getInstance("MD5");
		    md.update(password.getBytes());
		    byte[] digest = md.digest();
		    String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
		    System.out.println(myHash);    
		    System.out.println(myHash.getBytes().length);
		

	}

}
