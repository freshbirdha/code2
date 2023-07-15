import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * ����SVNϵͳ �����
 * 
 * 
 * ��½Э�飺// #denglu:[username,userpassword]
 * ��½Э�飺// #denglu#response:[false/true]
 * 
 * 
 * @author banma
 *
 */
public class Main {
	
	public static Map<String, String> usersMap = new HashMap<String, String>();

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("�������������С�������");
		
		try {
			
			ServerCMDThread sThread = new ServerCMDThread();
			sThread.setDaemon(true);
			sThread.start();
			
			ServerDataThread dThread = new ServerDataThread();
			dThread.setDaemon(true);
			dThread.start();
					
			System.out.println("�����ɹ���������");
			
			while(true) {
				System.out.println("1.�����˺�,2.�˳�");
				String selectString = input.nextLine();
				if("1".equals(selectString)) {
					System.out.print("�������û��˺�:");
					String username = input.nextLine();
					if(usersMap.containsKey(username)) {
						System.out.println("���˺��Ѿ����ڣ����������룡");
						continue;
					}
					
					System.out.print("�������û�����:");
					String password = input.nextLine();
					
					usersMap.put(username, password);
					
					System.out.println("ע��ɹ�����ǰϵͳ�û�����"+ usersMap.size());
					
				}else if("2".equals(selectString)) {
					break;
				}
				
			}
		
			
		} catch (Exception e) {
			System.out.println("����ʧ��:"+e.getMessage());
		}

		System.out.println("ϵͳ�˳�");
	}

}
