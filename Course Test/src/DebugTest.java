import java.util.Random;

public class DebugTest {
	
	public static void main(String[] args) {
		String banma = "banma-school.com";
		System.out.println(banma);
		banma = "手把手教学,一对一服务";
		System.out.println(banma);
		show();
		Random r = new Random();
		int rnum = r.nextInt();
		System.out.println(rnum);
		
											 	 			
	}
	public static void show() {
		
		String banma = "banma-school.com";
		System.out.println(banma);
		for(int i = 0; i <500; i++) {
			banma = "banma-school.com:" + i;
			System.out.println(banma);
		}
		System.out.println(banma);
	}

}
