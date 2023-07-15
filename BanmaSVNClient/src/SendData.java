import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import model.User;
/**
 *  命令协议: #cmd:[commit,abc.txt]
 * @author USER
 *
 */
public class SendData {
	public static boolean sendData(File file,User user)  {
		boolean flag = false;
		try {
			Socket socket = new Socket("localhost",18181);//传送文件走18181端口
			
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			
			BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
			
			String hashStr = MD5Util.getMD5(user.getUsername() + user.getPassword());
			
		//	System.out.println("client:" + hashStr );
			
			bos.write(hashStr.getBytes("utf-8"));
			byte[] bys = new byte[1024];
			
			int len = 0;
			while ((len = bis.read(bys)) != -1) {
				bos.write(bys,0,len);
				bos.flush();		
			}
			
			socket.shutdownOutput();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		User user = new User();
		user.setUsername("abc");
		user.setPassword("123");
		sendData(new File("banmasvn.svn"),user);
	}
}
