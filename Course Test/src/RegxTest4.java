import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxTest4 {
	 public static void main(String[] args) {
		
		//ָ���ַ�������
		String line = "This is order was placed for QT3000! OK?";
		String pattern = "\\d+"; 
		
		//����Pattern����
		Pattern p = Pattern.compile(pattern);
		
		//����matcher����
		Matcher m = p.matcher(line);
		
		if(m.find()) {
			System.out.println("Found value:" + m.group(0));  //����ƥ��
	//		System.out.println("Found value:" + m.group(1));  //��һ����
		
		}else {
			System.out.println("NO MATCH");
		}
		
		
			
	}


}


		
			
			
	