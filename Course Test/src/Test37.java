/**
 * 
 * @author USER
 *
 */

public class Test37 {
	
	 public static void main(String[] args) {   
		banma();
		int sum = add(3, 5);
		System.out.println(sum);
	   			        				 		 		 			
	} //main end;
	 	 
	 public static void  banma() { //void 不需要返回值,不能用return
		System.out.println("斑马编程教室");
		System.out.println("banma-school.com");
		 
				
	 }
	 
	 public static  int add(int a, int b) { //需要返回值时，关键字return ，定义类型并返回定义的类型
		 int c = a +b;
		 return c;
		 
				
	 }
	 
}//class end
	 
	


