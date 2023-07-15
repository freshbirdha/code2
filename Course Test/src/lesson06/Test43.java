package lesson06;
import java.util.*;

public class Test43 {
	
	 public static void main(String[] args) {
		 //ctrl +Shift +O 自动导包
		 Scanner input = new Scanner(System.in);
		// Random r = new Random();
		 	 	 
		 while(true) {
			 Operation.printArr(); //代码重构；
			 
			String select = input.next();
			if("w".equals(select)) {
				
				boolean flag = Operation.moveW();
				if(!flag) {
					break;
				}								
			}else if("s".equals(select)) {
				boolean flag = Operation.moveS();
				if(!flag) {
					break;
				}
				
				
			}else if("a".equals(select)) {
				boolean flag = Operation.moveA();
				if(!flag) {
					break;
				}							
			}else if("d".equals(select)) {
				boolean flag = Operation.moveD();
				if(!flag) {
					break;
				}										
			}
				 
		 } //while end
		 
	 } //main end
	 
	 
	 				
}
