import java.io.IOException;

public class ExcepbanmaTest4 {

	public static void main(String[] args)  {
		 try {
			print(-1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println(e);
		}
	  
	}
	
	public static int print(int a) throws IOException {
		if(a < 0) {
			throw new IOException();
			
		}
		return a;
	}

}
