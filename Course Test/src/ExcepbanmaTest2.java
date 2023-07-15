
public class ExcepbanmaTest2 {

	public static void main(String[] args) {
		 try {
			add(1,2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	}
	public static int add(int x,int y) throws Exception{
		if(x <0 || y < 0) {
			throw new Exception();
		}
		return x + y;
	}

}
