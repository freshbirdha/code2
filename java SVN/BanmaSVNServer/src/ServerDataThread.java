import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDataThread extends Thread {
	
	@Override
	public void run() {
		try {
			
			ServerSocket ss = new ServerSocket(9999);

			// 监听客户端连接
			Socket s = ss.accept();

			// 封装通道内流
			BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
			// 封装图片文件
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream("abc.mp4"));
	
			byte[] userinfo = new byte[32];
			bis.read(userinfo);
			
			//还原用户信息
			String userinfostr = new String(userinfo,"utf-8");
			System.out.println("接收到md5 :"+userinfostr);
//			
//			byte[] bys = new byte[1024];
//			int len = 0;
//			while ((len = bis.read(bys)) != -1) {
//				bos.write(bys, 0, len);
//				bos.flush();
//			}
//		
//			// 给一个反馈
//			OutputStream os = s.getOutputStream();
//			os.write("图片上传成功".getBytes());
//
//			bos.close();
//			s.close();
//			
//			while(true) {
//					
//				
//			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
