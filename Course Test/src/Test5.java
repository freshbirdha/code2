
public class Test5 {
	 //首先执行static代码块，然后执行main代码块
	static {
		System.out.println("www.banma-school.com");
	}
	
	public static void main(String[] args) {
		System.out.println("banma-school.com");
		 	 			
	}
	
	static {
		System.out.println("eee.banma-school.com");
	}

}
