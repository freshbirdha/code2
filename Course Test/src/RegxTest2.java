
 public class RegxTest2 {
	 public static void main(String[] args) {
		String string1 = "<h1>dsdadasdadadasdd</h1>";
		// .通配符，但只能匹配一个字符； *重复零次或更多次
		boolean flag = string1.matches("<h1>.*</h1>");
		System.out.println(flag); 
		
		String string2 = "<h1></h1>";
		System.out.println(string2.matches("<h1>.*</h1>"));
		
		// + 表示至少重复一次或更多次，也就是至少要有一个字符
		String string3 = "<h1></h1>";
		System.out.println(string3.matches("<h1>.+</h1>"));
		
		//限定范围[],只能代表一个字符
		
		String string4 = "aBc";
		System.out.println(string4.matches("[a-zA-Z]{3}"));
		
		String string5 = "aB!";
		System.out.println(string5.matches("[a-zA-Z]{3}"));
		
		String string6 = "123456";
		System.out.println(string6.matches("[0-6]{6}"));
		
		
		String string7 = "823456";
		System.out.println(string7.matches("[0-6]{6}"));
		
		//匹配ipd地址 如255.255.255.255  (中间的 . 字符是需要转义的)
		
		String string8 = "255.255.255.255";
		System.out.println(string8.matches("\\d{3}\\.\\d{3}.\\d{3}\\.\\d{3}"));
		//这个表达式重复了3次，可以写成(),后面一个255因为没有.
		System.out.println(string8.matches("(\\\\d{3}\\\\.){3}\\d{3}"));
		
		
		String string9 = "128.0.0.0";
		System.out.println(string9.matches("((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)"));
		// 匹配IP地址 一般通用正则表达式 ((2[0-4]\d|25[0-5]|[01]?\d\d?)\.){3}(2[0-4]\d|25[0-5]|[01]?\d\d?)
			
	}


}


		
			
			
	