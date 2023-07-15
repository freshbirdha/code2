import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDataThread extends Thread {
	
	@Override
	public void run() {
		try {
			
			ServerSocket serverSocket = new ServerSocket(18181);
			
			Socket socket = serverSocket.accept();
			
			BufferedInputStream biStream = new BufferedInputStream(socket.getInputStream());
			
			BufferedOutputStream boStream = new BufferedOutputStream(new FileOutputStream("log.png"));
			
			byte[] userinfo = new byte[32];
			biStream.read(userinfo);
			
			//还原用户信息
			
			String userinfostr = new String(userinfo,"utf-8");
			
			System.out.println("接收到md5:" + userinfostr);
			
//			byte [] bys = new byte[1024];
//			
//			int len = 0;
//			while ((len = biStream.read(bys)) != -1) {
//				boStream.write(bys,0,len);
//				boStream.flush();
//				
//			}
			
//			OutputStream oStream = socket.getOutputStream();
//			oStream.write("upload succced".getBytes());
//			
//			boStream.close();
//			socket.close();
//			while (true) {
//				
//			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
