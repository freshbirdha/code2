package lession07.tuixiangzi;
import java.util.Scanner;

/**
 *��������������Ϸ�ع�0.2�汾������
 * @author banma
 *
 */
public class Tuixiangzi {

	/**
	 * 游戏主�?�辑
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 

		while(true) {
			
			Operation.printArr();
			
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

		}//while end

	}// main end
	

}
