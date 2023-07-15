
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Timeprocess5 {
	 public static void main(String[] args) {
		 //Calendar ¿‡
		 Calendar c1 = Calendar.getInstance();
		
		 c1.set(2019, 3, 29);
		 SimpleDateFormat simple = new SimpleDateFormat("yyyyMMdd");
		 
		 System.out.println(simple.format(c1.getTime()));
	
		 
		 for(int i = 0; i < 10; i++) {
			 c1.add(Calendar.DATE, 1);
			 System.out.println(simple.format(c1.getTime()));
			 
		 }
		// System.out.println(c1.getTime());
		 
		
	}


}


		
			
			
	