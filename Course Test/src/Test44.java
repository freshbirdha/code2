import java.util.Scanner;

public class Test44 {
	 public static void main(String[] args) {   //main start
		System.out.println("����������ѡ��:(1~3֮�������)"); 	
		Scanner input = new Scanner(System.in);
		int num = 0;  // num = input.nextInt()���뵽��10��
		
		try {
				num = input.nextInt();
				System.out.println("�ɹ�");
		} catch (Exception e) {
			// TODO: handle exception
			num = 1;
		}
		
		switch(num) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
					System.out.println("three");
					break;
			case 4:
					System.out.println("four");
					break;
			default:
					System.out.println("error");
					break;
			
		}
	} //main end;
	 
	

}//class end
