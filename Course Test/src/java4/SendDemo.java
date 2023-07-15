package java4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建发送端Socket对象
		//DatagramSocket()
		DatagramSocket dSocket = new DatagramSocket();
		
		byte[] bys = "Hello,UDP!".getBytes();
		
		int length = bys.length;
		
		//接收端ip,以虚拟机地址做测试
		InetAddress address = InetAddress.getByName("192.168.0.70");     // localhost : 127.0.0.1//192.168.137.1
		
		int port = 11111;
		DatagramPacket dPacket = new DatagramPacket(bys, length,address,port);
		
		//调用Socket对象发送的数据包
		
		dSocket.send(dPacket);
		
		//释放资源
		dSocket.close();
		
		System.out.println("发送成功");
	}
   
}
