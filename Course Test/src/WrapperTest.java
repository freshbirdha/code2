
 public class WrapperTest {
	 public static void main(String[] args) {
		 int m = 500;
		 Integer obj = new Integer(m);
		 System.out.println("obj=" + obj);
		 
		 int n = obj.intValue();		 
		 System.out.println("n=" + n);
		 
		 //���ö����Դ��ķ���������������ת��
		 System.out.println("doubleValue:" + obj.doubleValue());
		 System.out.println("longValue:" + obj.longValue());
		 System.out.println("intValue:" + obj.intValue());
		 System.out.println("byteValue:" + obj.byteValue());
		 System.out.println("floatValue:" + obj.floatValue());
		 
		 //��String���͵�ֵת��Ϊֵ����
		 
		 Integer ob = new Integer("500");
		 
		 System.out.println(ob);
		 
		 ob = Integer.valueOf("600");
		 System.out.println(ob);
		 
		 double d = Double.valueOf("55");
		 System.out.println(d);
		 
		 
		 //��ֵ����ת�����ַ���
		 
		 String str1 = Integer.toString(500);
		 String str2 = Double.toString(55.5);
		 String str3 = Long.toString(1110L);
		 
		 System.out.println(str1);
		 System.out.println(str2);
		 System.out.println(str3);
		 
		 
		 String aString = "1";
		 int i = Integer.valueOf(aString);
		 System.out.println(i);
		 
		 
		 char a = '1';
		 Character character = a;
		 if(Character.isDigit(a)) {  //char�İ�װ���Դ��ķ���
			 System.out.println("����ֵ");
		 }else {
			 System.out.println("������ֵ");
		 }
		 
		 
		 
		 String string = "1111a";  //����ֵ�ַ����ǿ���ת����
		 boolean flag = true;
		 for(int y = 0; y < string.length(); y++) {
		 	 char c = string.charAt(y);
		 	 if(!Character.isDigit(c)) {
		 		 System.out.println("������ֵ������ת��");
		 		 flag = false;
		 		 break;
		 	 }
		 	 
		 }
		 
		 if(flag) {
			 int z = Integer.valueOf(string);
			 System.out.println(z);
		 }
		 
		 
		 Integer aInteger = new Integer(500);
		 Integer bInteger = new Integer(600);
		 
		 System.out.println(aInteger.compareTo(bInteger));  //����ֵΪ1��0��-1����װ��ĶԱ�
		 
		 
	/**
	 * 	 if(aInteger > bInteger) {
	
			 System.out.println("true");
		 }else {
			 System.out.println("false");
		 }
	 */
		 
		 
		 
		 
			
	}


}


		
			
			
	