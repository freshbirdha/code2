import java.util.Scanner;
 public class Hello {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("请输入您的姓名:");
		 String name = input.next();
		 System.out.print("请输入您的年龄:");
		 int age = input.nextInt();
		 System.out.print("请输入您的身高:");
		 double height = input.nextDouble();
		 
		 
		 
		 String nameStr = "您的名字是:" + name;
		 System.out.print(nameStr);
		 
		 System.out.print("您的年龄是:" + age);
		 
		 System.out.print("您的身高是:" + height);
		 
		 
		 	System.out.println(3);
			System.out.println(3.14); //float
			System.out.println(true);
			System.out.println('a');   //char
			System.out.println(3141592653L);//long
			System.out.println(314159265352532532525.2F); //F-float
			System.out.println(314159265352532532525.2D); //D-float
			
		}


}


		
			
			
	