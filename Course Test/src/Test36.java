/**
 * 
 * @author USER
 *
 */

public class Test36 {
	
	 public static void main(String[] args) {   
		int[] arrs = {1,2,3,4,5};
		encryption(arrs);
	   
		for(int i = 0; i < arrs.length; i++) {
			System.out.println(arrs[i]);
		}
		        
				 		 		 			
	} //main end;
	 
	 public static void encryption(int[] arr) {   
		for(int i = 0; i < arr.length; i++) {
			int value = arr[i];
			arr[i] = value + 5;
		}
		
		
	 }
	 
}//class end
	 
	


