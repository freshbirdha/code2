import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * char == 16bit
 * ����Э��: #cmd:[commit,abc.txt]
 * @author USER
 *
 */


public class SendCMD {
	public static String sendCMD(String cmd) {
	     String resopnseString = null;
	     Socket s = null;
	 	try {
			 s = new Socket("localhost",9999);  //������9999�˿�
		  
			//��װͨ���������
			BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(
					s.getOutputStream()));
			
			bWriter.write(cmd);
			bWriter.newLine();
			bWriter.flush();
			s.shutdownOutput();//֪ͨ������������
			
			//���շ���������
			BufferedReader bReader = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			
			resopnseString =  bReader.readLine();
														
		} catch (Exception e) {
			System.out.println("��½ʧ�ܣ������������ϵ����Ա");
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
