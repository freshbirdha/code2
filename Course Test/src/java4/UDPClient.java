package java4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPClient {//�����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1.�����������ַ���˿ڣ�����
		InetAddress address = InetAddress.getByName("localhost");
		int port = 8800;
		byte [] data = "Hello,banma".getBytes();
		
		//2.�������ݱ����������͵�������Ϣ
		
		DatagramPacket packet = new DatagramPacket(data, data.length,address,port);
		
		//3.����DatagramSocket����
		DatagramSocket socket = new DatagramSocket();
		
		//4. ��������˷������ݱ�
		socket.send(packet);
		socket.close();
		System.out.println("�������");
		
		//
		//
		

	}

}
