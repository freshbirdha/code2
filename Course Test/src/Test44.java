import java.util.Scanner;

public class Test44 {
	 public static void main(String[] args) {   //main start
		System.out.println("请输入您的选择:(1~3之间的整数)"); 	
		Scanner input = new Scanner(System.in);
		int num = 0;  // num = input.nextInt()放入到第10行
		
		try {
				num = input.nextInt();
				System.out.println("成功");
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
