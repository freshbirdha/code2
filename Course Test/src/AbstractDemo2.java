
public class AbstractDemo2 {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.ab();
	

	}

}

abstract class Human{  

	void ab() {
		System.out.println("ab");
	}
	
	abstract void show();    //没有方法体，只是修饰void方法，子类则必须实现show()方法
}

class Student extends Human{

	@Override
	void show() {
		// TODO Auto-generated method stub
		
	}
	
}




