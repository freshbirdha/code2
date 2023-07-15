package java4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//创建接收端的Socket对象
		//DategramSocket(int port)
		DatagramSocket dSocket = new DatagramSocket(11111);
		
		//创建一个数据包(接收容器)
		// DatagramPacket(byte[] buf,int,length)
		byte[] bys = new byte[1024];		
		int length = bys.length;		
		DatagramPacket dPacket = new DatagramPacket(bys, length);
		
		
		
		//调用Socket对象的接收方法接收数据
		//public void recevie(DatagramPacket p)
		dSocket.receive(dPacket);
		
		//解析数据包 并显示在控制台
		//获取对方的ip
		//Public InetAdress getAddress()
		InetAddress address = dPacket.getAddress();
		String ipString = address.getHostAddress();
		
		
		byte[] bys2 = dPacket.getData();
		int len = dPacket.getLength();
		String string = new String(bys2,0,len);
		System.out.println(ipString + "传递的数据是:" + string);
		
		dSocket.send(dPacket);
		
		
		//释放资源
		dSocket.close();
	}

}
