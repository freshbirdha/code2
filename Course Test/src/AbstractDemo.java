
public class AbstractDemo {

	public static void main(String[] args) {
	//	People people = new People();  People被修饰为抽象类，不能直接实例化
		
		Teacher t = new Teacher();
		t.setName("斑马先生");
		t.work();
		
		Driver d = new Driver();
		d.setName("王麻子");
		d.work();

	}

}

abstract class People{  
	private String name; //实例变量
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public abstract void work();
}

class Teacher extends People{ //子类
	public void work() {
		System.out.println("我的名字叫"+this.getName() + ",我正在讲课。。");
	}
}

class Driver extends People{
	public void work() {
		System.out.println("我的名字叫"+this.getName() + ",我在开车。。");
	}
}

