

/**
 * 
 * @author USER
 *
 */

public class Test39 {
	
	 public static void main(String[] args) {   
		 int sum = add(1,2);
		 double doubleSum = add(1.1,2.2);
		System.out.println(sum);
		System.out.println(doubleSum);
				   			        				 		 		 			
	} //main end;
	 	 		 
	
	//方法名可以相同 ，但参数类型要不一样
		 public static  int add(int a,int b) { 
			
				 int c = a +b;
				 return c;		 				
		 }
		 
		 public static  double add(double a,double b) { 
				
				 double c = a +b;
				 return c;	
			 
		 }
		 
		 public static  double add(int a,double b) { 
				
			 double c = a +b;
			 return c;	
		 
	 }
		 public static  double add(double a,int b) { 
				
			 double c = a +b;
			 return c;	
		 
	 }
		 
	 
		 	 
}//class end
	 
	


