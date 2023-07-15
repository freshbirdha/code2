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
 * 斑马SVN系统 入口类（客户端）
 * 
 * 
 * 登陆协议：// #denglu:[username,userpassword]
 * 登陆协议：// #denglu#response:[false/true]
 * 
 * 命令协议：// #cmd:[cmdstr]
 * 命令协议：// #cmd#response:[cmdstr]
 * 
 * 命令协议：// #cmd:[commit,abc.txt]
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
		System.out.println("欢迎使用斑马SVN系统！");
		
		try {
			
			User user = Login.login();//用户登陆
			
			if(user != null) {
				String username = user.getUsername();

				// 登陆成功后的操作流程
				System.out.println("登陆成功！！！");
				System.out.println();
				
				//判断svn客户端系统之前是否有存储的配置文件
				if(!svnhomefile.exists()) {
					System.out.print("请设置您的SVN家目录路径:");
					String homepath = input.nextLine();
					homeFile = new File(homepath);
					
					if(!homeFile.exists()) {
						homeFile.mkdir();
					}
					
					//将用户输入的家地址给写入到配置文件中去
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
						//存档功能（home目录的地址）
						
						break;
					}else if("commit".equals(cmds[0])){
						
					}
					
				}
				
			}else {
				System.out.println("登陆失败！");
			}
		
		} catch (Exception e) {
			System.out.println("系统错误:"+e.getMessage());
		}

		System.out.println("系统退出");
	}

}
