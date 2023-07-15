

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.User;

/**
 * 斑马SVN系统客户端入口类
 *
 * 登录协议: #denglu:[username,userpassword]
 *登录协议: #denglu#response:[true/false]
 *
 *命令协议: #cmd:[cmdstr]
 *命令响应协议: #cmd#response:[cmdstr]
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
		System.out.println("欢迎使用斑马SVN系统....");
		
		try {
			
			  User user = Login.login();
			 
			  if(user != null) {
				  
				  String username = user.getUsername();
				  
				//登录成功后的操作流程
					
					System.out.println("登陆成功");
					System.out.println();
				    if(!svnhomeFile .exists()) {
				    	System.out.println("请设置您的SVN家目录路径:");
				    	String homepath = input.nextLine();
				    	 homeFile = new File(homepath);
				    	
				    	if(!homeFile.exists()) {
				    		homeFile.mkdirs();
				    	}
				    	//将用户输入的家地址给写入到配置文件中去
				    	
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
							//存档
							break;				
						}else if("coommit".equals(cmds[0])) {
							
						}
						
					}
				
			  }else {
				  System.out.println("登陆失败");
			  }
			  				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("系统错误:" + e.getMessage());
			
		}
		
		System.out.println("系统退出");

	}

}
