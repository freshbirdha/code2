package java4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�������Ͷ�Socket����
		//DatagramSocket()
		DatagramSocket dSocket = new DatagramSocket();
		
		byte[] bys = "Hello,UDP!".getBytes();
		
		int length = bys.length;
		
		//���ն�ip,���������ַ������
		InetAddress address = InetAddress.getByName("192.168.0.70");     // localhost : 127.0.0.1//192.168.137.1
		
		int port = 11111;
		DatagramPacket dPacket = new DatagramPacket(bys, length,address,port);
		
		//����Socket�����͵����ݰ�
		
		dSocket.send(dPacket);
		
		//�ͷ���Դ
		dSocket.close();
		
		System.out.println("���ͳɹ�");
	}
   
}
