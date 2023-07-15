import java.util.*;

public class WrapperTest4 {
	 public static void main(String[] args) {
		 //字符串格式化
		 String str = null;
		 str = String.format("Hi, %s", "斑马教室");
		 System.out.println(str);
		 
		 System.out.printf("字母a的大写是: %c %n", 'A');
		 System.out.printf("100的16进制数是: %x %n", 100);
		 
		 System.out.printf("折扣是: %d%% %n", 75);
		 
		 System.out.printf("页码: %03d%n", 7);
		 
		Date date = new Date();
		
		System.out.printf("全部日期和时间信息: %tc%n",date);
		
		System.out.printf("年-月-日格式: %tF%n",date);
		
		System.out.printf("年/月/日格式: %tD%n",date);
		
		System.out.printf("HH:MM:SS PM格式(12时制)  %tr%n",date);
		
		System.out.printf("HH:MM:SS 格式(24时制)  %tT%n",date);
		
		System.out.printf("HH:MM 格式(24时制)  %tR%n",date);
		
		
		String string = "swww1s";
		
		boolean flag = string.matches("www");
		System.out.println(flag);
		
		
		 
	 }

 }
		
			
			
	