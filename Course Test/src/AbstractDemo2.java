
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
	
	abstract void show();    //û�з����壬ֻ������void���������������ʵ��show()����
}

class Student extends Human{

	@Override
	void show() {
		// TODO Auto-generated method stub
		
	}
	
}




