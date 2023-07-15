package Main_01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class RecevieThread implements Runnable{
	private DatagramSocket ds;
	
	public RecevieThread(DatagramSocket ds) {
		this.ds = ds;
	}
	
	
	@Override
	public void run() {
		try {
			while(true) {
				byte [] bys = new byte[1024];
				DatagramPacket dp = new DatagramPacket(bys, bys.length);
				
				//接收数据
				ds.receive(dp);
				
				//解析数据
				String ipString = dp.getAddress().getHostAddress();
				String string = new String(dp.getData(),0,dp.getLength());
				System.out.println("from" + ipString + "data is :" + string);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
