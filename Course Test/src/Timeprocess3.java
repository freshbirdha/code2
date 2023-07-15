
import java.util.Calendar;

public class Timeprocess3 {
	 public static void main(String[] args) {
		 //Calendar 类
		 Calendar c1 = Calendar.getInstance();
		//获得年份
		 int year = c1.get(Calendar.YEAR);
		 //
		 int month = c1.get(Calendar.MONTH) + 1;
		// 
		 int date = c1.get(Calendar.DATE);
		 
		 int hour = c1.get(Calendar.HOUR_OF_DAY);
		 
		 int minute = c1.get(Calendar.MINUTE);
		 
		 int second = c1.get(Calendar.SECOND);
		 
		 int day = c1.get(Calendar.DAY_OF_WEEK);// 返回值1代表星期日，2代表星期一，依此类推;
		 
		 System.out.println(year);
		 
		 System.out.println(month);
		 
		 System.out.println(date);
		 
		 System.out.println(hour);
		 
		 System.out.println(minute);
		 
		 System.out.println(second);
		 
		 System.out.println(day);
		 
		 
		 
		 
		 
		
	}


}


		
			
			
	