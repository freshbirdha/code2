
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

class Bicyle extends Vehicle implements ISP{ //继承某个类实现某个接口

	@Override
	void move() {
		System.out.println("骑自行车");
		
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



