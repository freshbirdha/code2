import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import model.User;

public class Login {
	
	public static User login() {
		Scanner input = new Scanner(System.in);
		
		User user = null;
		//µÇÂ½²Ù×÷
		loginf:while(true) {
			System.out.print("ÇëÊäÈëÄúµÄÕËºÅ:");
			String username = input.nextLine();
			
			System.out.print("ÇëÊäÈëÄúµÄÃÜÂë:");
			String password = input.nextLine();
		
			System.out.println("µÇÂ½ÖĞ¡£¡£¡£¡£¡£");
		
			String responseString = SendCMD.sendCMD("#denglu:["+username+","+password+"]");
			
			if(responseString.startsWith("#denglu#response:")) {
				
				//ÓÃ»§µÇÂ½²Ù×÷
				String flag = responseString.substring(responseString.indexOf("[")+1,responseString.indexOf("]"));
		
				if("true".equals(flag)) {
					//µÇÂ½³É¹¦
					user = new User();
					user.setUsername(username);
					user.setPassword(password);
					break loginf;
					
				}else {
					//µÇÂ½Ê§°Ü
					System.out.println("µÇÂ½Ê§°Ü£¡ÇëÖØĞÂµÇÂ½");
				}

			}
	

		}// µÇÂ½Á÷³ÌµÄ while end
		
		return user;
	}
}
