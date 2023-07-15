package java4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPClient {//服务端
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1.定义服务器地址，端口，数据
		InetAddress address = InetAddress.getByName("localhost");
		int port = 8800;
		byte [] data = "Hello,banma".getBytes();
		
		//2.创建数据报，包含发送的数据信息
		
		DatagramPacket packet = new DatagramPacket(data, data.length,address,port);
		
		//3.创建DatagramSocket对象
		DatagramSocket socket = new DatagramSocket();
		
		//4. 向服务器端发送数据报
		socket.send(packet);
		socket.close();
		System.out.println("发送完毕");
		
		//
		//
		

	}

}
