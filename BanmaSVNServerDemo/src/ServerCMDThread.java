import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 专门用一个线程来接收用户的输入连接分配
 * @author banma
 *
 */
public class ServerCMDThread extends Thread {
	
	@Override
	public void run() {
		try {
			
			ServerSocket serverSocket = new ServerSocket(8888);
			
			while(true) {
				//System.out.println("s1");
				Socket socket = serverSocket.accept();
				//System.out.println("s2");
				// 封装通道内的输入流
				BufferedReader br = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				
				// 封装输出流
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
						socket.getOutputStream()));
				
				String line = null;
				while ((line = br.readLine()) != null) { // 阻塞
					//System.out.println("s3");
					//#denglu:[username,userpassword]
					if(line.startsWith("#denglu:")) {
						//System.out.println("s4");
						//用户登陆操作
						String usernameString = line.substring(line.indexOf("[") + 1,line.indexOf("]"));
					
						//进行验证
						String username =  usernameString.split(",")[0];
						String password =  usernameString.split(",")[1];
						
						//System.out.println(username+":"+password);
						String savepassword = Main.usersMap.get(username);
						
						//返回验证结果
						if(savepassword != null && savepassword.equals(password)) {
							bw.write("#denglu#response:[true]");
							bw.flush();
						}else {
							bw.write("#denglu#response:[false]");
							bw.flush();
						}
						
						socket.shutdownOutput();
						//System.out.println("s5");
					}// while end
					
				}//while end
				
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
