import java.io.IOException;

public class ExcepbanmaTest5 {

	public static void main(String[] args)  {
		 try {
			print(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println(e);
		}
		 System.out.println("aa");
	  
	}
	
	public static int print(int a) throws IOException,IndexOutOfBoundsException {
		if(a < 0) {
			throw new IOException();
			
		}
		int[] arr = {1,2};
		System.out.println(arr[3]);
		return a;
	}

}
