import java.util.Scanner;

public class Test10 {
	//switch ���ֻ�ܶ�Ӧ����In����, char, String��������
	public static void main(String[] args) {
		int days = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("�������:");
		int year = sc.nextInt();
		System.out.print("�����·�:");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
		case 2:
			if(year%4 ==0 && year%100!=0 || year%400 == 0) {
				days = 29;
			}else {
				days = 28;
			}
			break;
			default:
				System.out.println("�·��������");
				System.exit(0);
		}
		
		System.out.println("����:" + days);
				
				 	 			
	}


}
