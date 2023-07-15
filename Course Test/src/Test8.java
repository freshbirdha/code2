
public class Test8 {
	
	public static void main(String[] args) {
		int a = 2008;
		if((a % 4 ==0 && a % 100 !=0) || a % 400 ==0) {
			System.out.println("闰年");
			if(a > 2000) {
				System.out.println("21世纪的闰年");
			}else {
				System.out.println("21世纪之前的闰年");
			}
		}else {
			if(a > 2000) {
				System.out.println("21世纪的平年");				
			}else {
				System.out.println("21世纪之前的平年");
			}
			
		}
		
		
		
		
	
		 	 			
	}


}
