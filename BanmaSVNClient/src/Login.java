
import java.util.Scanner;
import model.User;

public class Login {
	public static User login() {
		Scanner input = new Scanner(System.in);
		User user = null;
		 loginf:while (true) {
				System.out.print("�����������˺�");
				String  username = input.nextLine();
				
				System.out.print("��������������");
				String password = input.nextLine();
				
				System.out.println("��½�С�����");
			    String  responseString = SendCMD.sendCMD("#denglu:["+username+","+password+"]");
				if(responseString.startsWith("#denglu#response:")) {
					
					
					
				String flag = responseString.substring(responseString.indexOf("[")+1,responseString.indexOf("]"));

					if("true".equals(flag)) {
						//��¼�ɹ�,������¼loginf:whileѭ�� ,�����¼�ɹ���Ĳ���
						//System.out.println("��½�ɹ�");
						user = new User();
						user.setPassword(password);
						user.setUsername(username);
						break loginf;
						
					}else {
						System.out.println("��¼ʧ��,�����µ�¼");
					
					}
				}
				
			}//��¼����while end
		return user;
	}
}
