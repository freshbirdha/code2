package Main_01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�������ն˵�Socket����
		DatagramSocket ds = new DatagramSocket(12345);
		
		while (true) {
			//����һ������
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys, bys.length);
			
			//��������
			ds.receive(dp);
			
			
			//��������
			String ipString = dp.getAddress().getHostAddress();
			String s = new String(dp.getData(),0,dp.getLength());
			System.out.println("from" + ipString + "data is :" + s);
			
		}//while end
		
		
		//�ͷ���Դ
		//���ն�Ӧ��һֱ���ŵȴ��������ݣ�����Ҫ�ر�
		// ds.close();
	}

}
