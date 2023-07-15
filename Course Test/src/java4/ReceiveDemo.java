package java4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//�������ն˵�Socket����
		//DategramSocket(int port)
		DatagramSocket dSocket = new DatagramSocket(11111);
		
		//����һ�����ݰ�(��������)
		// DatagramPacket(byte[] buf,int,length)
		byte[] bys = new byte[1024];		
		int length = bys.length;		
		DatagramPacket dPacket = new DatagramPacket(bys, length);
		
		
		
		//����Socket����Ľ��շ�����������
		//public void recevie(DatagramPacket p)
		dSocket.receive(dPacket);
		
		//�������ݰ� ����ʾ�ڿ���̨
		//��ȡ�Է���ip
		//Public InetAdress getAddress()
		InetAddress address = dPacket.getAddress();
		String ipString = address.getHostAddress();
		
		
		byte[] bys2 = dPacket.getData();
		int len = dPacket.getLength();
		String string = new String(bys2,0,len);
		System.out.println(ipString + "���ݵ�������:" + string);
		
		dSocket.send(dPacket);
		
		
		//�ͷ���Դ
		dSocket.close();
	}

}
