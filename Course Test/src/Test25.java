import java.util.Scanner;

public class Test25 {
	 public static void main(String[] args) {
		 while(true) {
			 Scanner input = new Scanner(System.in);
			 System.out.println("��ӭʹ������DVD������");
			 System.out.println("--------------------");
			 System.out.println("1.����DVD");
			 System.out.println("2.�鿴DVD");
			 System.out.println("3.ɾ��DVD");
			 System.out.println("4.���DVD");
			 System.out.println("5.�黹DVD");
			 System.out.println("6.�˳�");
			 System.out.println("--------------------");
			 System.out.println("��ѡ��:");
			 int selected = input.nextInt();
			 if(selected == 1) {
				 System.out.println("�˴�ʵ������DVD����");
				 System.out.println("******************");
				 System.out.println("����0����:");
				 int selectedReturn = input.nextInt();
			 }else if(selected == 6) {
				 System.out.println("");
				 System.out.println("ллʹ��");	
				 break;
			 }
							 						 		 		 			
		}
	
	}
}

