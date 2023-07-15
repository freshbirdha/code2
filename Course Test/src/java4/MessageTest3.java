package java4;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;


public class MessageTest3 {
	
	public static void main(String[] args) throws Exception {
		//����
		String string = "����������̽���";
		byte[] plain = string.getBytes("UTF-8");
		System.out.println("����ǰ:" + string);
		//���ɹ�Կ/˽Կ��
		KeyPairGenerator kpGen = KeyPairGenerator.getInstance("RSA");  //�õ�RSAʵ��
		kpGen.initialize(1024); //��ʼ����Կ���ȣ�1024λ����2048��
		KeyPair keyPair = kpGen.generateKeyPair();
		
		//˽Կ  /�����湫Կ��һ�ԣ����Ǵ�keyPair����
		PrivateKey sKey = keyPair.getPrivate();
		
		//��Կ
		PublicKey pKey = keyPair.getPublic();
		
		//����Կ��16�����ַ�չʾ
		byte[] pkbyte = pKey.getEncoded();
		System.out.println(String.format("��Կ:%x", new BigInteger(1,pkbyte)));
		
		//��˽Կ��16�����ַ�չʾ
		byte[] skbyte = sKey.getEncoded();
		System.out.println(String.format("˽Կ:%x", new BigInteger(1,skbyte)));
		
		//����,ͳһ�ù�Կ����
		byte[] encrypted = RSAUtil.encrypt(pKey,plain);	
		System.out.println(String.format("���ܺ�:%x", new BigInteger(1,encrypted)));
		
		//���� ˽Կ����
		byte[] decrypted = RSAUtil.decrypt(sKey,encrypted);
		System.out.println("���ܺ�:" + new String(decrypted,"UTF-8"));
		
		
	}
	
	
}