
public class AbstractDemo {

	public static void main(String[] args) {
	//	People people = new People();  People������Ϊ�����࣬����ֱ��ʵ����
		
		Teacher t = new Teacher();
		t.setName("��������");
		t.work();
		
		Driver d = new Driver();
		d.setName("������");
		d.work();

	}

}

abstract class People{  
	private String name; //ʵ������
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public abstract void work();
}

class Teacher extends People{ //����
	public void work() {
		System.out.println("�ҵ����ֽ�"+this.getName() + ",�����ڽ��Ρ���");
	}
}

class Driver extends People{
	public void work() {
		System.out.println("�ҵ����ֽ�"+this.getName() + ",���ڿ�������");
	}
}

