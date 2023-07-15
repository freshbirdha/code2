package Main_01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建接收端的Socket对象
		DatagramSocket ds = new DatagramSocket(12345);
		
		while (true) {
			//创建一个包裹
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys, bys.length);
			
			//接收数据
			ds.receive(dp);
			
			
			//解析数据
			String ipString = dp.getAddress().getHostAddress();
			String s = new String(dp.getData(),0,dp.getLength());
			System.out.println("from" + ipString + "data is :" + s);
			
		}//while end
		
		
		//释放资源
		//接收端应该一直开着等待接收数据，不需要关闭
		// ds.close();
	}

}
