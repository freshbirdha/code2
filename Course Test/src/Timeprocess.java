import java.text.SimpleDateFormat;
import java.util.Date;

public class Timeprocess {
	 public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
//		System.out.println(String.valueOf(start));
		
		long sum = 0;
		for(int i = 0; i < 10000000;i++) {
			sum+=i;
		}
		
		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println("Difference is:" + diff);
		
		Date date = new Date();
		
		Date date2 = new Date(System.currentTimeMillis());
		
		System.out.println(date);
		
		System.out.println(date2);
		
		Date dNowDate = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("当前时间为" + ft.format(dNowDate));
		
		SimpleDateFormat ft2 = new SimpleDateFormat("yyyy年MM月dd hh时mm分ss秒");
		System.out.println("当前时间为:" + ft2.format(dNowDate));
			
	}


}


		
			
			
	