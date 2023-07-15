
public class Test45 {
	 public static void main(String[] args) {   //main start
		try {
			int a[] = new int[2];
			System.out.println("Access element three:" + a[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Exception thrown:" + e);
		}
		System.out.println("Out of the block");
	} //main end;
	 
	

}//class end
