package Main_08;

import java.io.IOException;
import java.net.DatagramSocket;

/**
 * UDPЭ��Ⱥ�� ���㲥
 * @author USER
 *
 */
public class ChatRoom {
	public static void main(String[] args) throws IOException {
		DatagramSocket dsSend = new DatagramSocket();
		DatagramSocket dsRecevie = new DatagramSocket(11306);
		
		SendThread st = new SendThread(dsSend);
		RecevieThread rt = new RecevieThread(dsRecevie);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(rt);
		
		t1.start();
		t2.start();
	}

}
