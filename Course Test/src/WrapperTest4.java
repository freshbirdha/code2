import java.util.*;

public class WrapperTest4 {
	 public static void main(String[] args) {
		 //�ַ�����ʽ��
		 String str = null;
		 str = String.format("Hi, %s", "�������");
		 System.out.println(str);
		 
		 System.out.printf("��ĸa�Ĵ�д��: %c %n", 'A');
		 System.out.printf("100��16��������: %x %n", 100);
		 
		 System.out.printf("�ۿ���: %d%% %n", 75);
		 
		 System.out.printf("ҳ��: %03d%n", 7);
		 
		Date date = new Date();
		
		System.out.printf("ȫ�����ں�ʱ����Ϣ: %tc%n",date);
		
		System.out.printf("��-��-�ո�ʽ: %tF%n",date);
		
		System.out.printf("��/��/�ո�ʽ: %tD%n",date);
		
		System.out.printf("HH:MM:SS PM��ʽ(12ʱ��)  %tr%n",date);
		
		System.out.printf("HH:MM:SS ��ʽ(24ʱ��)  %tT%n",date);
		
		System.out.printf("HH:MM ��ʽ(24ʱ��)  %tR%n",date);
		
		
		String string = "swww1s";
		
		boolean flag = string.matches("www");
		System.out.println(flag);
		
		
		 
	 }

 }
		
			
			
	