
public class ExcepTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[2];
		try {
			
			System.out.println("Access element three:" + a[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {  
				// TODO: handle exception
			/** ArrayIndexOutOfBoundsExceptionԤ��Ҫ����ʲô�쳣
			 *     �����֪������ֱ��д��Exception e,�׸�����
			 */		
			System.out.println("Exception thrown:" + e);
		}
		finally {
			a[0] = 6;
			System.out.println("First element value:" + a[0]);
			System.out.println("The finally statement is executed");
			
			
		}
		

	}

}
