
public class Test43 {
	
	 public static void main(String[] args) {   //main start
		 Card c = new Card();
		 c.setType("a"); //进入public  void setType(String type)方法的else
		 
		 System.out.println(c.getType());//取值，不需要有参数
		
		 
		 c.setValue("A");
		 
		 System.out.println(c.getValue());
		 
		 c.show();
				 		 		 			
	} //main end;
	 
	

}//class end
