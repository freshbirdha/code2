
/**
 * ����ʱ�쳣
 * @author USER
 *
 */
public class ExcepbanmaTest7 {

	public static void main(String[] args) {
	/**
	 * 	boolean f =false;
		if(f) {
			throw new RuntimeException();
		}
	 */
		show(1);
		
	
	  
	}
	private static void show(int a ) {
		if(a < 0) {
			throw new RuntimeException("����aС��0");
		}
	}
	

}
