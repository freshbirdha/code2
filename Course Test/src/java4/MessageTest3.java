package java4;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;


public class MessageTest3 {
	
	public static void main(String[] args) throws Exception {
		//明文
		String string = "东京斑马编程教室";
		byte[] plain = string.getBytes("UTF-8");
		System.out.println("加密前:" + string);
		//生成公钥/私钥对
		KeyPairGenerator kpGen = KeyPairGenerator.getInstance("RSA");  //拿到RSA实例
		kpGen.initialize(1024); //初始化密钥长度，1024位，或2048等
		KeyPair keyPair = kpGen.generateKeyPair();
		
		//私钥  /和下面公钥是一对，都是从keyPair生成
		PrivateKey sKey = keyPair.getPrivate();
		
		//公钥
		PublicKey pKey = keyPair.getPublic();
		
		//将公钥以16进制字符展示
		byte[] pkbyte = pKey.getEncoded();
		System.out.println(String.format("公钥:%x", new BigInteger(1,pkbyte)));
		
		//将私钥以16进制字符展示
		byte[] skbyte = sKey.getEncoded();
		System.out.println(String.format("私钥:%x", new BigInteger(1,skbyte)));
		
		//加密,统一用公钥加密
		byte[] encrypted = RSAUtil.encrypt(pKey,plain);	
		System.out.println(String.format("加密后:%x", new BigInteger(1,encrypted)));
		
		//解密 私钥解密
		byte[] decrypted = RSAUtil.decrypt(sKey,encrypted);
		System.out.println("解密后:" + new String(decrypted,"UTF-8"));
		
		
	}
	
	
}
