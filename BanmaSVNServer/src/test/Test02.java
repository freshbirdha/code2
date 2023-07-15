package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class Test02 {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		String filename = "src/test/resources/test_md5.txt";
	    
	         
	    MessageDigest md = MessageDigest.getInstance("MD5");
	    md.update(Files.readAllBytes(Paths.get(filename)));
	    byte[] digest = md.digest();
	    String myChecksum = DatatypeConverter.printHexBinary(digest).toUpperCase();

	}

}
