
 public class RegxTest {
	 public static void main(String[] args) {
		String string = "080-5988-3872";
		boolean flag = string.matches("\\d{3}-\\d{4}-\\d{4}");
		System.out.println(flag); 
		
		String string2 = "^";
		boolean check = string2.matches("\\^");
		System.out.println(check);
		
		
		
			
	}


}


		
			
			
	