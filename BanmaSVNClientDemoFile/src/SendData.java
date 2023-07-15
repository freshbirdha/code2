import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;

import model.User;
/**
 * 命令协议：// #cmd:[commit,abc.txt]
 * @author banma
 *
 */
public class SendData {
	
	public static boolean sendData(File file,User user) {
		
		boolean flag  = false;
		
		try {
			Socket s = new Socket("localhost", 9999);

			// 封装文件
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
					file));
			// 封装通道内的流
			BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
			
			//md5
			// abc:123 -> md5(abc:123) -> abnufudhfuasdfsdaf3     <- 32个长度的字符 32 * 8
			String hsstr = MD5Util.getMD5(user.getUsername() + user.getPassword());
			System.out.println("客户端MD5:"+hsstr);
			bos.write(hsstr.getBytes("utf-8"));
			
			byte[] bys = new byte[1024];
			int len = 0;
			while ((len = bis.read(bys)) != -1) {
				bos.write(bys, 0, len);
				bos.flush();
			}
			
			s.shutdownOutput();
			

		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
				
	}
	
	public static void main(String[] args) {
		User user = new User();
		user.setUsername("abc");
		user.setPassword("123");
		
		sendData(new File("banmasvn.svn"), user);
	}
}
