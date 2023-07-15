
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 斑马SVN系统入口类
 *
 * 登录协议: #denglu:[username,userpassword]
 *登录协议:" #denglu#response:[true/false]
 * 
 * @author USER
 *
 */
public class Main {
	
	public static Map<String, String>usersMap = new HashMap<String,String>();
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("服务正在启动中....");
		
		try {
			ServerCMDThread sThread = new ServerCMDThread();
			sThread.setDaemon(true);//守护线程，主线程结束，子线程也会跟着结束
			sThread.start();
			
			ServerDataThread dThread = new ServerDataThread();
			dThread.setDaemon(true);
			dThread.start();
			System.out.println("启动成功....");
			
			while (true) {
				System.out.println("1.创建账号，2.退出");
				
				String selectString = input.nextLine();
				
				if("1".equals(selectString)) {
					System.out.print("请输入用户账号");
					String username = input.nextLine();
					if(usersMap.containsKey(username)) {
						System.out.println("此账号已存在，请重新输入！");
						continue;		
					}
					
					System.out.print("请输入用户密码");
					String password = input.nextLine();
					usersMap.put(username, password);				
					System.out.println("注册成功，当前用户数:" + usersMap.size());
				
				}else if("2".equals(selectString)) {
					break;
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("启动失败:" + e.getMessage());
			
		}
		
		System.out.println("系统退出");

	}

}
