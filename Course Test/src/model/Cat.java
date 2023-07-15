package model;

public class Cat {
	public String color; //属性 字段变量;
	public int age;//如果是用static关键字修饰即public static int age，age会变成全局变量,属于类即Catd的
	public static int NO = 1;
	public int id;
	
	//构造方法
	//公共无参数构造
	public Cat() {
		System.out.println("Cat()");
		id();
		
	}
	//公共有参构造
	public Cat(String color,int age) {
		this.color = color;  //this.color 代表类代码块里的color,而右边的color代表外部传进来的color;
		this.age = age;
		id();
			
	}
	
	private void id() {
		id = NO;
		NO++;	
		
	}
	
	public void jiao() {
		if(age < 2) {
			System.out.println("111 我的ID:" + id);
			
		}else {
			System.out.println("222 我的ID:" + id);
		}
	}

}
