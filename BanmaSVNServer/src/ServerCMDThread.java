import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * ר����һ���߳����������û����������ӷ���
 * @author USER
 *
 */
public class ServerCMDThread extends Thread {
	@Override
	public void run() {
		
		
		try {
			ServerSocket serverSocket = new ServerSocket(9999);
		//	Socket socket = serverSocket.accept();
		//	System.out.println("s1");
			while(true) {
				//��װͨ����������
				Socket socket = serverSocket.accept();
			//	System.out.println("s2");
				BufferedReader bReader = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				
				
				//��װͨ���������
				BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(
						socket.getOutputStream()));
				
				String line = null;
				while ((line = bReader.readLine()) != null) {
			//		System.out.println("s3");
					if(line.startsWith("#denglu:")) {
						
				//		System.out.println("s4");
						
						String username = line.substring(line.indexOf("[") +1,line.indexOf("]"));
						//������֤��������֤���
						String usernameString = username.split(",")[0];
						String passwordString = username.split(",")[1];
						
						String savedpassword = Main.usersMap.get(usernameString);
						
						if(savedpassword != null && savedpassword.equals(passwordString)) {
							bWriter.write("#denglu#response:[true]");
							bWriter.flush();
						}else {
							bWriter.write("#denglu#response:[false]");
							bWriter.flush();
						}
					    
						socket.shutdownOutput();
			//			System.out.println("s5");
					}
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
