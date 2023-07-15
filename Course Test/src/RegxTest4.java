import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxTest4 {
	 public static void main(String[] args) {
		
		//指定字符串查找
		String line = "This is order was placed for QT3000! OK?";
		String pattern = "\\d+"; 
		
		//创建Pattern对象
		Pattern p = Pattern.compile(pattern);
		
		//创建matcher对象
		Matcher m = p.matcher(line);
		
		if(m.find()) {
			System.out.println("Found value:" + m.group(0));  //完整匹配
	//		System.out.println("Found value:" + m.group(1));  //第一部分
		
		}else {
			System.out.println("NO MATCH");
		}
		
		
			
	}


}


		
			
			
	