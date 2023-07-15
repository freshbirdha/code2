import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import model.User;

/**
 * ����SVNϵͳ ����ࣨ�ͻ��ˣ�
 * 
 * 
 * ��½Э�飺// #denglu:[username,userpassword]
 * ��½Э�飺// #denglu#response:[false/true]
 * 
 * ����Э�飺// #cmd:[cmdstr]
 * ����Э�飺// #cmd#response:[cmdstr]
 * 
 * ����Э�飺// #cmd:[commit,abc.txt]
 * 
 * @author banma
 *
 */
public class Main {
	
	public static Map<String, String> usersMap = new HashMap<String, String>();

	public static void main(String[] args) {
		
		File svnhomefile = new File("banmasvn.svn");
		File homeFile = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭʹ�ð���SVNϵͳ��");
		
		try {
			
			User user = Login.login();//�û���½
			
			if(user != null) {
				String username = user.getUsername();

				// ��½�ɹ���Ĳ�������
				System.out.println("��½�ɹ�������");
				System.out.println();
				
				//�ж�svn�ͻ���ϵͳ֮ǰ�Ƿ��д洢�������ļ�
				if(!svnhomefile.exists()) {
					System.out.print("����������SVN��Ŀ¼·��:");
					String homepath = input.nextLine();
					homeFile = new File(homepath);
					
					if(!homeFile.exists()) {
						homeFile.mkdir();
					}
					
					//���û�����ļҵ�ַ��д�뵽�����ļ���ȥ
					FileWriter fileWriter = new FileWriter(svnhomefile);
					fileWriter.write(homepath);
					fileWriter.flush();
					
					fileWriter.close();
					
				}
				
				while(true) {
					//SVN:banma001>
					System.out.print("SVN:"+username+">");
					String cmdString = input.nextLine();
					cmdString = cmdString.trim();
					String[] cmds = cmdString.split(" ");
					
					if("exit".equals(cmds[0])) {
						//�浵���ܣ�homeĿ¼�ĵ�ַ��
						
						break;
					}else if("commit".equals(cmds[0])){
						
					}
					
				}
				
			}else {
				System.out.println("��½ʧ�ܣ�");
			}
		
		} catch (Exception e) {
			System.out.println("ϵͳ����:"+e.getMessage());
		}

		System.out.println("ϵͳ�˳�");
	}

}
