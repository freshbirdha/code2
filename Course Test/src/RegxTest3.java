import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxTest3 {
	 public static void main(String[] args) {
		String string = "128.0.0.0";
		System.out.println(string.matches("((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)"));
		// ƥ��IP��ַ һ��ͨ��������ʽ ((2[0-4]\d|25[0-5]|[01]?\d\d?)\.){3}(2[0-4]\d|25[0-5]|[01]?\d\d?)
		
		//pattern��  ����һ��pattern���󣬸÷�������һ��������ʽ��Ϊ���ĵ�һ������
		
		String  content = "www.banma-school.com";
		String pattern = ".*banma-school.*";
		
		boolean isMatch = Pattern.matches(pattern, content);
		System.out.println("�ַ������Ƿ������'banma-school'���ַ���?"  +  isMatch);
		
		//ָ���ַ�������
		String line = "This is order was placed for QT3000! OK?";
		String pattern2 = "(\\D*)(\\d+)(.*)";  //��дD��ʾƥ����������ֵ��ַ�
		
		//����Pattern����
		Pattern p = Pattern.compile(pattern2);
		
		//����matcher����
		Matcher m = p.matcher(line);
		
		if(m.find()) {
			System.out.println("Found value:" + m.group(0));  //����ƥ��
			System.out.println("Found value:" + m.group(1));  //��һ����
			System.out.println("Found value:" + m.group(2));
			System.out.println("Found value:" + m.group(3));
		}else {
			System.out.println("NO MATCH");
		}
		
		
			
	}


}


		
			
			
	