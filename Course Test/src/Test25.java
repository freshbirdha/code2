import java.util.Scanner;

public class Test25 {
	 public static void main(String[] args) {
		 while(true) {
			 Scanner input = new Scanner(System.in);
			 System.out.println("欢迎使用迷你DVD管理器");
			 System.out.println("--------------------");
			 System.out.println("1.新增DVD");
			 System.out.println("2.查看DVD");
			 System.out.println("3.删除DVD");
			 System.out.println("4.借出DVD");
			 System.out.println("5.归还DVD");
			 System.out.println("6.退出");
			 System.out.println("--------------------");
			 System.out.println("请选择:");
			 int selected = input.nextInt();
			 if(selected == 1) {
				 System.out.println("此处实现新增DVD功能");
				 System.out.println("******************");
				 System.out.println("输入0返回:");
				 int selectedReturn = input.nextInt();
			 }else if(selected == 6) {
				 System.out.println("");
				 System.out.println("谢谢使用");	
				 break;
			 }
							 						 		 		 			
		}
	
	}
}

