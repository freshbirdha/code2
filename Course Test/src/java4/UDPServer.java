package java4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UDPServer {//�����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1.������������DatagramSocket,ָ���˿�
		DatagramSocket socket = new DatagramSocket(8800);
		//2.�������ݱ������ڽ��տͻ��˷��͵�����
		byte[] data = new byte[1024];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		//3.���տͻ��˷��͵�����
		System.out.println("********���������Ѿ�����,�ȴ��ͻ���������");
		socket.receive(packet);//�˷����ڽ��յ����ݱ�֮ǰ��һֱ����
		//4.��ȡ����
		String infoString = new String(data,0,packet.getLength());
		System.out.println("���Ƿ��������ͻ���˵:" + infoString);
		socket.close();

	}

}
