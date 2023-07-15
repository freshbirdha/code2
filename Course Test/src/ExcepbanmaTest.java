
public class ExcepbanmaTest {

	public static void main(String[] args) throws Exception {
		 add(1,2);
	  
	}
	public static int add(int x,int y) throws Exception{
		if(x <0 || y < 0) {
			throw new Exception();
		}
		return x + y;
	}

}
