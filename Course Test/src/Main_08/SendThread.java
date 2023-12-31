package Main_08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable{
	private DatagramSocket ds;
	public SendThread(DatagramSocket ds) {
		this.ds = ds;
	}
	
	@Override
	public void run() {
		try {
		
			//封装键盘录入数据
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while ((line = br.readLine())!= null) {
				if("886".equals(line)) {
					break;
				}			
			
				byte[] bys = line.getBytes();
				
				//广播局域网
				
				DatagramPacket dp = new DatagramPacket(bys, bys.length,InetAddress.getByName("255.255.255.255"),11306);
			    
				
				ds.send(dp);
			}
			
			ds.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
