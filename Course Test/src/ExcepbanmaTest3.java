
import java.util.Scanner;

public class ExcepbanmaTest3 {

	public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 int i = 0;
		 try {
			i = input.nextInt();
			
		} catch (Exception e) {
			// TODO: handle exception
		//	System.out.println("���Ͳ�ƥ��");
			e.printStackTrace();
		}
		
		 System.out.println(i);
	  
	}
	



}
