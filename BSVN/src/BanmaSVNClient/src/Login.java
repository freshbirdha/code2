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
		//��½����
		loginf:while(true) {
			System.out.print("�����������˺�:");
			String username = input.nextLine();
			
			System.out.print("��������������:");
			String password = input.nextLine();
		
			System.out.println("��½�С���������");
		
			String responseString = SendCMD.sendCMD("#denglu:["+username+","+password+"]");
			
			if(responseString.startsWith("#denglu#response:")) {
				
				//�û���½����
				String flag = responseString.substring(responseString.indexOf("[")+1,responseString.indexOf("]"));
		
				if("true".equals(flag)) {
					//��½�ɹ�
					user = new User();
					user.setUsername(username);
					user.setPassword(password);
					break loginf;
					
				}else {
					//��½ʧ��
					System.out.println("��½ʧ�ܣ������µ�½");
				}

			}
	

		}// ��½���̵� while end
		
		return user;
	}
}
