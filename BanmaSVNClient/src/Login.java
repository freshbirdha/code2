
import java.util.Scanner;
import model.User;

public class Login {
	public static User login() {
		Scanner input = new Scanner(System.in);
		User user = null;
		 loginf:while (true) {
				System.out.print("请输入您的账号");
				String  username = input.nextLine();
				
				System.out.print("请输入您的密码");
				String password = input.nextLine();
				
				System.out.println("登陆中。。。");
			    String  responseString = SendCMD.sendCMD("#denglu:["+username+","+password+"]");
				if(responseString.startsWith("#denglu#response:")) {
					
					
					
				String flag = responseString.substring(responseString.indexOf("[")+1,responseString.indexOf("]"));

					if("true".equals(flag)) {
						//登录成功,跳出登录loginf:while循环 ,进入登录成功后的操作
						//System.out.println("登陆成功");
						user = new User();
						user.setPassword(password);
						user.setUsername(username);
						break loginf;
						
					}else {
						System.out.println("登录失败,请重新登录");
					
					}
				}
				
			}//登录流程while end
		return user;
	}
}
