import java.util.Scanner;

 public class Test12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			String str = input.next();
			if("exit".equals(str)) {
				break;
			}
			System.out.println("�ش�:" + str);
		}
		System.out.println("�������");											 	 			
	}


}
