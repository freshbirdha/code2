package java4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UDPServer {//服务端
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1.创建服务器端DatagramSocket,指定端口
		DatagramSocket socket = new DatagramSocket(8800);
		//2.创建数据报，用于接收客户端发送的数据
		byte[] data = new byte[1024];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		//3.接收客户端发送的数据
		System.out.println("********服务器端已经启动,等待客户发送数据");
		socket.receive(packet);//此方法在接收到数据报之前会一直阻塞
		//4.读取数据
		String infoString = new String(data,0,packet.getLength());
		System.out.println("我是服务器，客户端说:" + infoString);
		socket.close();

	}

}
