
 public class WrapperTest {
	 public static void main(String[] args) {
		 int m = 500;
		 Integer obj = new Integer(m);
		 System.out.println("obj=" + obj);
		 
		 int n = obj.intValue();		 
		 System.out.println("n=" + n);
		 
		 //利用对象自带的方法进行数据类型转换
		 System.out.println("doubleValue:" + obj.doubleValue());
		 System.out.println("longValue:" + obj.longValue());
		 System.out.println("intValue:" + obj.intValue());
		 System.out.println("byteValue:" + obj.byteValue());
		 System.out.println("floatValue:" + obj.floatValue());
		 
		 //将String类型的值转换为值类型
		 
		 Integer ob = new Integer("500");
		 
		 System.out.println(ob);
		 
		 ob = Integer.valueOf("600");
		 System.out.println(ob);
		 
		 double d = Double.valueOf("55");
		 System.out.println(d);
		 
		 
		 //将值类型转换成字符串
		 
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
		 if(Character.isDigit(a)) {  //char的包装类自带的方法
			 System.out.println("是数值");
		 }else {
			 System.out.println("不是数值");
		 }
		 
		 
		 
		 String string = "1111a";  //纯数值字符串是可以转换的
		 boolean flag = true;
		 for(int y = 0; y < string.length(); y++) {
		 	 char c = string.charAt(y);
		 	 if(!Character.isDigit(c)) {
		 		 System.out.println("不是数值，不能转换");
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
		 
		 System.out.println(aInteger.compareTo(bInteger));  //返回值为1，0，-1；包装类的对比
		 
		 
	/**
	 * 	 if(aInteger > bInteger) {
	
			 System.out.println("true");
		 }else {
			 System.out.println("false");
		 }
	 */
		 
		 
		 
		 
			
	}


}


		
			
			
	