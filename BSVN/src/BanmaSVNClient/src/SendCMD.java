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
			
			// ��װͨ������
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					s.getOutputStream()));
			
			bw.write(cmd);
			bw.newLine();
			bw.flush();
			s.shutdownOutput();//֪ͨ������ ���Ѿ����������

			
			//���շ������˵ķ���
			BufferedReader br = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			
			 responseString = br.readLine();
			
		} catch (IOException e) {
			System.out.println("��½ʧ�ܣ������������磬������ϵ����������Ա��");
		}catch (Exception e) {
			System.out.println("��½ʧ�ܣ������������磬������ϵ����������Ա��");
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
