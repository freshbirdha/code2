import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 斑马SVN系统 入口类
 * 
 * 
 * 登陆协议：// #denglu:[username,userpassword]
 * 登陆协议：// #denglu#response:[false/true]
 * 
 * 
 * @author banma
 *
 */
public class Main {
	
	public static Map<String, String> usersMap = new HashMap<String, String>();

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("服务正在启动中。。。。");
		
		try {
			
			ServerCMDThread sThread = new ServerCMDThread();
			sThread.setDaemon(true);
			sThread.start();
			
			ServerDataThread dThread = new ServerDataThread();
			dThread.setDaemon(true);
			dThread.start();
					
			System.out.println("启动成功。。。。");
			
			while(true) {
				System.out.println("1.创建账号,2.退出");
				String selectString = input.nextLine();
				if("1".equals(selectString)) {
					System.out.print("请输入用户账号:");
					String username = input.nextLine();
					if(usersMap.containsKey(username)) {
						System.out.println("此账号已经存在，请重新输入！");
						continue;
					}
					
					System.out.print("请输入用户密码:");
					String password = input.nextLine();
					
					usersMap.put(username, password);
					
					System.out.println("注册成功，当前系统用户数："+ usersMap.size());
					
				}else if("2".equals(selectString)) {
					break;
				}
				
			}
		
			
		} catch (Exception e) {
			System.out.println("启动失败:"+e.getMessage());
		}

		System.out.println("系统退出");
	}

}
