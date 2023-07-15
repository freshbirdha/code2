import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * char == 16bit
 * 命令协议: #cmd:[commit,abc.txt]
 * @author USER
 *
 */


public class SendCMD {
	public static String sendCMD(String cmd) {
	     String resopnseString = null;
	     Socket s = null;
	 	try {
			 s = new Socket("localhost",9999);  //命令走9999端口
		  
			//封装通道内输出流
			BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(
					s.getOutputStream()));
			
			bWriter.write(cmd);
			bWriter.newLine();
			bWriter.flush();
			s.shutdownOutput();//通知服务器发完了
			
			//接收服务器反馈
			BufferedReader bReader = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			
			resopnseString =  bReader.readLine();
														
		} catch (Exception e) {
			System.out.println("登陆失败，请检查网络或联系管理员");
		}finally {
			try {
				if(s != null) {
					s.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		     
	     return resopnseString;	     
	}
}
