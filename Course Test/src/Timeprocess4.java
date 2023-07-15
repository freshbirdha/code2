import java.util.Date;
import java.util.Calendar;

public class Timeprocess4 {
	 public static void main(String[] args) {
		 //Calendar 类
		 Calendar c1 = Calendar.getInstance();
		 Date date = c1.getTime();
		 System.out.println("时间为:" + date);
		 
		 //Calendar 类set方法
		 
		 Calendar c2 = Calendar.getInstance();
		  c2.set(Calendar.DATE, 4); 
		  Date date2  = c2.getTime();
		 System.out.println("时间为:" + date2);
		 
		 //Calendar 类add方法
		 Calendar c3 = Calendar.getInstance();
		  c3.add(Calendar.DATE, 4); 
		  Date date3  = c3.getTime();
		 System.out.println("时间为:" + date3);
		 
		 
		 
		
	}


}


		
			
			
	