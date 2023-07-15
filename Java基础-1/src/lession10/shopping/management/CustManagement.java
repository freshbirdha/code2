package lession10.shopping.management;

import java.util.Scanner;

public class CustManagement {
	/*��Ʒ��Ϣ*/
	public String[] goodsName;
    public double[] goodsPrice;
    
    /*��Ա��Ϣ*/
    public int[] custNo;
    public String[] custBirth;
    public int[] custScore;
 
	
	  /**
	   * �������ݿ�
	   */
	   public void setData(String[] goodsName1, double[] goodsPrice1, int[] custNo1, String[] custBirth1, int[] custScore1){
		   goodsName = goodsName1;
		   goodsPrice = goodsPrice1;
		   custNo = custNo1;
		   custBirth = custBirth1;
		   custScore = custScore1;
	   }
	   
	   /**
	    * ������һ���˵�
	    */
	   public void returnLastMenu(){
		   System.out.print("\n\n�밴'n'������һ���˵�:");
		   Scanner input = new Scanner(System.in);
		   boolean con = true;
		   do{ 
		     if(input.next().equals("n")){
			    Menu menu = new Menu();
		        menu.setData(goodsName, goodsPrice, custNo, custBirth, custScore);
		        menu.showCustMMenu();
		     }else{
		    	System.out.print("�������, ������'n'������һ���˵���");
		    	con = false;
		     }
	       }while(!con);
	   }
	   
	   /**
        * ���ӻ�Ա
        */
	    public void add(){
	    	System.out.println("���������ϵͳ > �ͻ���Ϣ���� > ��ӿͻ���Ϣ\n\n");
	    	Scanner input = new Scanner(System.in); 
	    	int no  = -1;	    	
	    	while(true) {
	    		try {
	    			input = new Scanner(System.in); 
		    		System.out.print("�������Ա��(<4λ����>)��");
					 no = input.nextInt();
		    		break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("��������ȷ�Ļ�Ա��");
				}
	    		
	    	}
	    	
			System.out.print("�������Ա���գ���/��<����λ����ʾ>����");
			String birth = input.next();
			System.out.print("��������֣�");
			int score = input.nextInt();
			int index = -1;
			for(int i = 0; i< custNo.length; i++){
				if(custNo[i] == 0){
					index = i;
					break;
				}
			}
			custNo[index] = no;
			custBirth[index] = birth;
			custScore[index] = score;
			System.out.println("�»�Ա��ӳɹ���");
			
			//������һ���˵�
			returnLastMenu();
	    }
	    
	    /**
	      * ���Ŀͻ���Ϣ
	      */
		public void modify(){
			 System.out.println("���������ϵͳ > �ͻ���Ϣ���� > �޸Ŀͻ���Ϣ\n\n");
			 System.out.print("�������Ա�ţ�");
			 Scanner input = new Scanner(System.in);
			 int no = input.nextInt();
			 System.out.println("  ��Ա��            ����             ����      ");	     
		     System.out.println("------------|------------|---------------");
		     int index = -1;
			 for(int i = 0; i < custNo.length; i++){
			      if(custNo[i] == no){
			    	  System.out.println(custNo[i] + "\t\t" + custBirth[i]+"\t\t" + custScore[i]);
			    	  index = i;
			    	  break;
			       }
		     }
			 if(index !=-1){
				 System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
				 System.out.println("\t\t\t\t1.�� �� �� Ա �� ��.\n");
				 System.out.println("\t\t\t\t2.�� �� �� Ա �� ��.\n");
				 System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
				 System.out.print("��ѡ���������֣�");
				 switch(input.nextInt()){
				    case 1:
				    	System.out.print("�������޸ĺ�����գ�");
				    	custBirth[index] = input.next();
				    	System.out.println("������Ϣ�Ѹ��ģ�");
				    	break;
				    case 2:
				    	System.out.print("�������޸ĺ�Ļ�Ա���֣�");
				    	custScore[index] = input.nextInt();
				    	System.out.println("��Ա�����Ѹ��ģ�");
				    	break;
				 }
			 }else{
				 System.out.println("��Ǹ��û�����ѯ�Ļ�Ա��");
				 
			 }
			 //������һ���˵�
			 returnLastMenu();
			 
		}
		
		 /**
	       * ��ѯ�ͻ�����Ϣ
	       */  
		  public void search(){
			 System.out.println("���������ϵͳ > �ͻ���Ϣ���� > ��ѯ�ͻ���Ϣ\n");
			 String con = "y";
			 Scanner input = new Scanner(System.in);
			 while(con.equals("y")){
			   System.out.print("�������Ա�ţ�");
			   int no = input.nextInt();
			   System.out.println("  ��Ա��            ����             ����      ");	     
		       System.out.println("------------|------------|---------------");
			   boolean isAvailable = false;
		       for(int i = 0; i < custNo.length; i++){
			      if(custNo[i] == no){
			    	  System.out.println(custNo[i] + "\t\t" + custBirth[i]+"\t\t" + custScore[i]);
			    	  isAvailable = true;
			    	  break;
			       }
		       }
			   if(!isAvailable){
				  System.out.println("��Ǹ��û�����ѯ�Ļ�Ա��Ϣ��");
			   }
			   System.out.print("\nҪ������ѯ��y/n��:");
			   con = input.next();
		     }
			 
			 //������һ���˵�
			 returnLastMenu();
		  }	  
		  
		    /**
		      * ��ʾ���еĻ�Ա��Ϣ
		      */
			public void show(){
				System.out.println("���������ϵͳ > �ͻ���Ϣ���� > ��ʾ�ͻ���Ϣ\n\n");
				System.out.println("  ��Ա��            ����             ����      ");	     
				System.out.println("------------|------------|---------------");
				int length = custNo.length;
				for(int i= 0; i<length;i++){
					if(custNo[i] == 0){
						break;  //�ͻ���Ϣ�Ѿ���ʾ���
					}
					System.out.println(custNo[i] + "\t\t" + custBirth[i]+ "\t\t" + custScore[i]);
				}
				
				//������һ���˵�
				returnLastMenu();
			}
}
