/**
 * 自定义异常
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
			throw new ExcepbanmaTest6("变量a必须大于0");
			
		}
		return  a;
	}

}


