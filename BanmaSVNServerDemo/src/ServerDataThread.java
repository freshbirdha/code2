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

			// �����ͻ�������
			Socket s = ss.accept();

			// ��װͨ������
			BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
			// ��װͼƬ�ļ�
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream("abc.mp4"));
	
			byte[] userinfo = new byte[32];
			bis.read(userinfo);
			
			//��ԭ�û���Ϣ
			String userinfostr = new String(userinfo,"utf-8");
			System.out.println("���յ�md5 :"+userinfostr);
//			
//			byte[] bys = new byte[1024];
//			int len = 0;
//			while ((len = bis.read(bys)) != -1) {
//				bos.write(bys, 0, len);
//				bos.flush();
//			}
//		
//			// ��һ������
//			OutputStream os = s.getOutputStream();
//			os.write("ͼƬ�ϴ��ɹ�".getBytes());
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
