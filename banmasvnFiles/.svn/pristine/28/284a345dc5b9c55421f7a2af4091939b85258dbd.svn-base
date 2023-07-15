import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * char == 16bit
 * 
 * @author banma
 *
 */
public class SendCMD {
	
	public static String sendCMD(String cmd) {
		
		String responseString = null;
		Socket s = null;
		try {
			
			 s = new Socket("localhost", 8888);
			
			// 封装通道内流
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					s.getOutputStream()));
			
			bw.write(cmd);
			bw.newLine();
			bw.flush();
			s.shutdownOutput();//通知服务器 我已经发送完毕了

			
			//接收服务器端的反馈
			BufferedReader br = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			
			 responseString = br.readLine();
			
		} catch (IOException e) {
			System.out.println("登陆失败！请检查您的网络，或是联系服务器管理员！");
		}catch (Exception e) {
			System.out.println("登陆失败！请检查您的网络，或是联系服务器管理员！");
		}finally {
			try {
				if(s != null) {
					s.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return responseString;
	}
}
