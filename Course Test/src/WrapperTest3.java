
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
		 //ȡ��test
		 System.err.println(string.substring(10, 15));
		 
		 int index = string.indexOf("test");
		 int endindex = string.indexOf("of java");
		 System.err.println(string.substring(index, endindex));
		 
		 //�����ַ������Ƶ�һ���ַ�����char[]str��
		 char[] str = string.toCharArray();
		 
		 //��ÿ�����ʵĵ�һ����ĸ��ɴ�д
		 
		 String[] strArr = string.trim().split(" ");
		 
		 for(int i = 0; i < strArr.length; i++) {
			 
			 char c = strArr[i].charAt(0);
			 c = Character.toUpperCase(c);
			 
			 String newString = strArr[i].substring(1);
			 
			 strArr[i] = c + newString;
			 
			System.out.println(strArr[i]);
			
		 }
		 
		 //�����ַ�ʽ���ַ����ĵ������
		 
		 for(int i = str.length-1; i >0 ; i--) {
					System.out.print(str[i]);
						 
			 }
		 System.out.println();
		 
		 
		 StringBuffer stringBuffer = new StringBuffer(string);
	//	 System.out.println(stringBuffer.toString());
		 System.out.println(stringBuffer.reverse().toString());
		 
	 }

 }
		
			
			
	