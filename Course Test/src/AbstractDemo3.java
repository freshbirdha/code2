
public class AbstractDemo3 {

	public static void main(String[] args) {
		Type type = new Type();
		type.vehicle = new Bicyle();
		type.move();
		
		ISP isp = new Bicyle();
		isp.start();
		isp.stop();

	}

}

class Type{  
	Vehicle vehicle;
	public void move() {
		if(vehicle!=null) {
			vehicle.move();
		}
		
	}

	
}

abstract class Vehicle{
	abstract void move();

	public void stop() {
		// TODO Auto-generated method stub
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}	
}

class Bicyle extends Vehicle implements ISP{ //�̳�ĳ����ʵ��ĳ���ӿ�

	@Override
	void move() {
		System.out.println("�����г�");
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}



