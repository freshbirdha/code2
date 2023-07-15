import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxTest5 {
	 public static void main(String[] args) {
		 //匹配邮箱
		 String string = "xxxx@banma.com";
		 boolean f = string.matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$");
		 System.out.println(f);
		 
			String html = "<!DOCTYPE html>"+
						"<html>"+
						"<head>"+
						"<title>东京斑马编程教室</title>"+	
						"</head>"+
						"<body>"+
						"<div class='banma1'>学编程！来东京斑马！</div> " +
							"<div class=\"banma2\">一对一服务</div>" +
							"<div class=\"banma3\">手把手教学</div>" +
						"</body>" +
						"</html>";
			
			Pattern p = Pattern.compile("<title>(.+)</title>");
			Matcher matcher = p.matcher(html);
			
			if(matcher.find()) {
				System.out.println(matcher.group(0));
				System.out.println(matcher.group(1));
			}
					
	}


}


		
			
			
	