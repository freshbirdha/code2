import java.util.Random;

/**
 * 
 * @author USER
 *
 */

public class Test38 {
	
	 public static void main(String[] args) {   
		 int r = square(5);
		System.out.println(r);
		
		int r1 = compare(9, 3);
		System.out.println(r1);
		
		System.out.println(random());
	   			        				 		 		 			
	} //main end;
	 	 		 
	 public static  int square(int x) { 
		
		 return x * x;
		 				
	 }
	 
	 public static  int compare(int x,int y) { 
		
		 return x >y ? x:y;
		 				
	 }
	 
	 public static  int random() { 
		 Random r  =  new Random();
		 int result = r.nextInt(10) + 1;	
		 return result;
		 				
	 }
	 
	 
}//class end
	 
	


