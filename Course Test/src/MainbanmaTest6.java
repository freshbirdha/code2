/**
 * �Զ����쳣
 * @author USER
 *
 */

public class MainbanmaTest6 {

	public static void main(String[] args)  {
		try {
			print(-1);
		} catch (ExcepbanmaTest6 e) {
			System.out.println(e.getmString());
		}
	  
	}
	
	public static int print(int a) throws ExcepbanmaTest6 {
		if(a < 0) {
			throw new ExcepbanmaTest6("����a�������0");
			
		}
		return  a;
	}

}


