import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxTest5 {
	 public static void main(String[] args) {
		 //ƥ������
		 String string = "xxxx@banma.com";
		 boolean f = string.matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$");
		 System.out.println(f);
		 
			String html = "<!DOCTYPE html>"+
						"<html>"+
						"<head>"+
						"<title>���������̽���</title>"+	
						"</head>"+
						"<body>"+
						"<div class='banma1'>ѧ��̣�����������</div> " +
							"<div class=\"banma2\">һ��һ����</div>" +
							"<div class=\"banma3\">�ְ��ֽ�ѧ</div>" +
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


		
			
			
	