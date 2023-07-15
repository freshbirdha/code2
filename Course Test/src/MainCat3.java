import java.util.Scanner;

import model.Cat;

public class MainCat3 {

	public static void main(String[]args) {
	
		Scanner input = new Scanner(System.in);
		
		Cat[] list = new Cat[10];
		
		
		System.out.println("请输入猫信息");
		
		
		System.out.print("color:");
		String color = input.next();
		
		System.out.print("age:");
		int age = input.nextInt();
		
		Cat m = new Cat(color,age);
		
		list[0] = m;
		
		for(int i =0; i < list.length; i++) {
			Cat c = list[i];
		//	System.out.println(c.age + " " + c.color);  //Exception in thread "main" java.lang.NullPointerException
		//解决空指针的办法
			if(c != null) {
				System.out.println(c.age + " " + c.color); 
			}
			//c.jiao();    
		}
		
	}

}
