import java.util.Scanner;

 public class Test14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			String str = input.next();
			System.out.println(str);
			if("quit".equals(str)) {// str.equals(另外一个字符串),输入quit才结束程序
				break;
			}
	
		}
											 	 			
	}


}
