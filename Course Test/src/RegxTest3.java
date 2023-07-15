import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxTest3 {
	 public static void main(String[] args) {
		String string = "128.0.0.0";
		System.out.println(string.matches("((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)"));
		// 匹配IP地址 一般通用正则表达式 ((2[0-4]\d|25[0-5]|[01]?\d\d?)\.){3}(2[0-4]\d|25[0-5]|[01]?\d\d?)
		
		//pattern类  返回一个pattern对象，该方法接受一个正则表达式作为它的第一个参数
		
		String  content = "www.banma-school.com";
		String pattern = ".*banma-school.*";
		
		boolean isMatch = Pattern.matches(pattern, content);
		System.out.println("字符串中是否包含了'banma-school'子字符串?"  +  isMatch);
		
		//指定字符串查找
		String line = "This is order was placed for QT3000! OK?";
		String pattern2 = "(\\D*)(\\d+)(.*)";  //大写D表示匹配任意非数字的字符
		
		//创建Pattern对象
		Pattern p = Pattern.compile(pattern2);
		
		//创建matcher对象
		Matcher m = p.matcher(line);
		
		if(m.find()) {
			System.out.println("Found value:" + m.group(0));  //完整匹配
			System.out.println("Found value:" + m.group(1));  //第一部分
			System.out.println("Found value:" + m.group(2));
			System.out.println("Found value:" + m.group(3));
		}else {
			System.out.println("NO MATCH");
		}
		
		
			
	}


}


		
			
			
	