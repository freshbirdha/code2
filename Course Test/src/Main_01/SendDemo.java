package Main_01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�������Ͷ˵�Socket����
		DatagramSocket ds = new DatagramSocket();
		
		//��װ����¼������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine())!= null) {
			if("886".equals(line)) {
				break;
			}			
		
			byte[] bys = line.getBytes();
			
			DatagramPacket dp = new DatagramPacket(bys, bys.length,InetAddress.getByName("192.168.0.70"),12345);
		    
			
			ds.send(dp);
		}
	}

}
