
 public class WrapperTest3 {
	 public static void main(String[] args) {
		 
		 String string = " this is a test of java";
		 int count = 0;
		 for(int i = 0; i < string.length(); i++) {
			 char c = string.charAt(i);
			 if(c== 's') {
				 count++;
			 }
			
		 }
		 System.out.println(count);
		 //取出test
		 System.err.println(string.substring(10, 15));
		 
		 int index = string.indexOf("test");
		 int endindex = string.indexOf("of java");
		 System.err.println(string.substring(index, endindex));
		 
		 //将本字符串复制到一个字符数组char[]str中
		 char[] str = string.toCharArray();
		 
		 //将每个单词的第一个字母变成大写
		 
		 String[] strArr = string.trim().split(" ");
		 
		 for(int i = 0; i < strArr.length; i++) {
			 
			 char c = strArr[i].charAt(0);
			 c = Character.toUpperCase(c);
			 
			 String newString = strArr[i].substring(1);
			 
			 strArr[i] = c + newString;
			 
			System.out.println(strArr[i]);
			
		 }
		 
		 //用两种方式该字符串的倒序输出
		 
		 for(int i = str.length-1; i >0 ; i--) {
					System.out.print(str[i]);
						 
			 }
		 System.out.println();
		 
		 
		 StringBuffer stringBuffer = new StringBuffer(string);
	//	 System.out.println(stringBuffer.toString());
		 System.out.println(stringBuffer.reverse().toString());
		 
	 }

 }
		
			
			
	