
 public class RegxTest2 {
	 public static void main(String[] args) {
		String string1 = "<h1>dsdadasdadadasdd</h1>";
		// .ͨ�������ֻ��ƥ��һ���ַ��� *�ظ���λ�����
		boolean flag = string1.matches("<h1>.*</h1>");
		System.out.println(flag); 
		
		String string2 = "<h1></h1>";
		System.out.println(string2.matches("<h1>.*</h1>"));
		
		// + ��ʾ�����ظ�һ�λ����Σ�Ҳ��������Ҫ��һ���ַ�
		String string3 = "<h1></h1>";
		System.out.println(string3.matches("<h1>.+</h1>"));
		
		//�޶���Χ[],ֻ�ܴ���һ���ַ�
		
		String string4 = "aBc";
		System.out.println(string4.matches("[a-zA-Z]{3}"));
		
		String string5 = "aB!";
		System.out.println(string5.matches("[a-zA-Z]{3}"));
		
		String string6 = "123456";
		System.out.println(string6.matches("[0-6]{6}"));
		
		
		String string7 = "823456";
		System.out.println(string7.matches("[0-6]{6}"));
		
		//ƥ��ipd��ַ ��255.255.255.255  (�м�� . �ַ�����Ҫת���)
		
		String string8 = "255.255.255.255";
		System.out.println(string8.matches("\\d{3}\\.\\d{3}.\\d{3}\\.\\d{3}"));
		//������ʽ�ظ���3�Σ�����д��(),����һ��255��Ϊû��.
		System.out.println(string8.matches("(\\\\d{3}\\\\.){3}\\d{3}"));
		
		
		String string9 = "128.0.0.0";
		System.out.println(string9.matches("((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)"));
		// ƥ��IP��ַ һ��ͨ��������ʽ ((2[0-4]\d|25[0-5]|[01]?\d\d?)\.){3}(2[0-4]\d|25[0-5]|[01]?\d\d?)
			
	}


}


		
			
			
	