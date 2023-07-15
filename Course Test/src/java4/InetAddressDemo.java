package java4;

import java.io.IOException;
import java.net.InetAddress;


public class InetAddressDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InetAddress address = InetAddress.getByName("www.baidu.com");
		
		//��ȡ������
		String nameString = address.getHostName();
		
		//��ȡIP��ַ
		String ipString = address.getHostAddress();
		
		System.out.println(nameString + "----" + ipString);
		
		boolean f = address.isReachable(1000);
		System.out.println("isReachable:" + f);
	}

}
