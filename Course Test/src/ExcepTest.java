
public class ExcepTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[2];
			System.out.println("Access element three:" + a[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {  
				// TODO: handle exception
			/** ArrayIndexOutOfBoundsException预测要出现什么异常
			 *     如果不知道可以直接写成Exception e,抛给父类
			 */		
			System.out.println("Exception thrown:" + e);
		}
		System.out.println("Out of the block");

	}

}
