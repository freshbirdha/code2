
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ����SVNϵͳ�����
 *
 * ��¼Э��: #denglu:[username,userpassword]
 *��¼Э��:" #denglu#response:[true/false]
 * 
 * @author USER
 *
 */
public class Main {
	
	public static Map<String, String>usersMap = new HashMap<String,String>();
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("��������������....");
		
		try {
			ServerCMDThread sThread = new ServerCMDThread();
			sThread.setDaemon(true);//�ػ��̣߳����߳̽��������߳�Ҳ����Ž���
			sThread.start();
			
			ServerDataThread dThread = new ServerDataThread();
			dThread.setDaemon(true);
			dThread.start();
			System.out.println("�����ɹ�....");
			
			while (true) {
				System.out.println("1.�����˺ţ�2.�˳�");
				
				String selectString = input.nextLine();
				
				if("1".equals(selectString)) {
					System.out.print("�������û��˺�");
					String username = input.nextLine();
					if(usersMap.containsKey(username)) {
						System.out.println("���˺��Ѵ��ڣ����������룡");
						continue;		
					}
					
					System.out.print("�������û�����");
					String password = input.nextLine();
					usersMap.put(username, password);				
					System.out.println("ע��ɹ�����ǰ�û���:" + usersMap.size());
				
				}else if("2".equals(selectString)) {
					break;
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("����ʧ��:" + e.getMessage());
			
		}
		
		System.out.println("ϵͳ�˳�");

	}

}
