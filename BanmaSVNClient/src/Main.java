

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.User;

/**
 * ����SVNϵͳ�ͻ��������
 *
 * ��¼Э��: #denglu:[username,userpassword]
 *��¼Э��: #denglu#response:[true/false]
 *
 *����Э��: #cmd:[cmdstr]
 *������ӦЭ��: #cmd#response:[cmdstr]
 * 
 * @author USER
 *
 */
public class Main {
	public static Map<String, String>usersMap = new HashMap<String,String>();
	//private static Socket s;
	public static void main(String[] args) {
	
		File svnhomeFile = new File("banmasvn.svn");
		File homeFile = null;
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭʹ�ð���SVNϵͳ....");
		
		try {
			
			  User user = Login.login();
			 
			  if(user != null) {
				  
				  String username = user.getUsername();
				  
				//��¼�ɹ���Ĳ�������
					
					System.out.println("��½�ɹ�");
					System.out.println();
				    if(!svnhomeFile .exists()) {
				    	System.out.println("����������SVN��Ŀ¼·��:");
				    	String homepath = input.nextLine();
				    	 homeFile = new File(homepath);
				    	
				    	if(!homeFile.exists()) {
				    		homeFile.mkdirs();
				    	}
				    	//���û�����ļҵ�ַ��д�뵽�����ļ���ȥ
				    	
				    	FileWriter fileWriter = new FileWriter(svnhomeFile);
				    	fileWriter.write(homepath);
				    	fileWriter.flush();
				    	fileWriter.close();
				    }
					while (true) {
						System.out.println("SVN:"+ username + ">");
						String cmdString = input.nextLine();
						String [] cmds = cmdString.trim().split(" ");
						if("exit".equals(cmds[0])) {
							//�浵
							break;				
						}else if("coommit".equals(cmds[0])) {
							
						}
						
					}
				
			  }else {
				  System.out.println("��½ʧ��");
			  }
			  				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("ϵͳ����:" + e.getMessage());
			
		}
		
		System.out.println("ϵͳ�˳�");

	}

}
