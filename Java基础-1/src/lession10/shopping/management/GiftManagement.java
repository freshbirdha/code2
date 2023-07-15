package lession10.shopping.management;

import java.util.Scanner;

import lession08.shopping.data.Gift;


/**
 *�������
 */
public class GiftManagement {
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
		        menu.showSendGMenu();
		     }else{
		    	System.out.print("�������, ������'n'������һ���˵���");
		    	con = false;
		     }
	       }while(!con);
	   }
	
	/**
	  * ʵ�������ʺ���
	  */
	  public void sendBirthCust(){
		  System.out.println("���������ϵͳ > �����ʺ�\n\n");
		  System.out.print("��������������(��/��<����λ��ʾ>)��");
          Scanner input = new Scanner(System.in);
          String date = input.next();
          System.out.println(date);
          String no = "";
          boolean isAvailable = false;
          for(int i = 0; i < custBirth.length; i++){
       	    if(custBirth[i]!=null && custBirth[i].equals(date)){
       		  no = no + custNo[i] + "\n";
       		  isAvailable = true;
       	    }
          }
          if(isAvailable){
       	     System.out.println("�����յĻ�Ա�ǣ�");
       	     System.out.println(no);
             System.out.println("��ϲ������MP3һ����");
          }else{
       	     System.out.println("����û�й����յĻ�Ա��");
          }     
          
          //������һ���˵�
          returnLastMenu();
	  }
	  
	  /**
       *  �������˻�Ա
       */
	  public void  sendLuckyCust(){
		  System.out.println("���������ϵͳ > ���˳齱\n\n");
		  System.out.print("�Ƿ�ʼ��y/n����");
		  Scanner input = new Scanner(System.in);
		  if(input.next().equals("y")){
			  int random = (int)(Math.random()* 10);
			  int baiwei; //��λ 
			  boolean isAvailable = false;
			  String list = "";
              for(int i = 0; i< custNo.length; i++){
                 if(custNo[i]==0){
                	 break;
                 } 
    			 baiwei = custNo[i] / 100 % 10;
            	 if(baiwei == random){
            		 list = list + custNo[i]+ "\t";
            		 isAvailable = true;
            	 }
              }
              if(isAvailable){
            	   System.out.println("���˿ͻ�����MP3��" + list);
              }else{
            	   System.out.println("�����˿ͻ���");
              }
		  }
		  
		  //������һ���˵�
          returnLastMenu();
	  }
	  
	  public void sendGoldenCust(){
		  System.out.println("���������ϵͳ > ���˴����\n\n");
		  int index = 0;
		  int max = custScore[0];
		  //�ٶ����ָ�����ͬ
		  for(int i = 0; i < custScore.length; i++){
			  if(custScore[i] == 0){
				  break;  //�������Ϊ���û�
			  }
			  //�������ֵĿͻ�
			  if(custScore[i] > max){
				  max = custScore[i];
				  index = i;
			  }
		  }
		  System.out.println("������߻��ֵĻ�Ա�ǣ� " + custNo[index] + "\t" + custBirth[index] + "\t" + custScore[index]);
          //�����ʼǱ����Զ���
		  Gift laptop = new Gift();
		  laptop.name = "ƻ���ʼǱ�����";
		  laptop.price = 12000;
		  System.out.print("��ϲ��������Ʒ�� ");
		  System.out.println(laptop);
		  
          //������һ���˵�
          returnLastMenu();
	  }
}
