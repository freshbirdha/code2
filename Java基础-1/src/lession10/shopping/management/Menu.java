package lession10.shopping.management;

import java.util.Scanner;

/**
 *Menu.java
 *�˵��� 
 */
public class Menu {
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
	 * ��ʾ���������ϵͳ�ĵ�¼�˵�
	 */
	public void showLoginMenu() {
		System.out.println("\n\n\t\t\t    ��ӭʹ�ð��������ϵͳ1.0��\n\n");
		System.out.println ("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t\t\t 1. �� ¼ ϵ ͳ\n\n");
		System.out.println("\t\t\t\t 2. �� �� �� �� Ա �� ��\n\n");
		System.out.println("\t\t\t\t 3. �� ��\n\n");
		System.out.println ("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("��ѡ��,��������:");    
	}	
	
	/**
	 * ��ʾ���������ϵͳ�����˵�
	 */
	public void showMainMenu() {
		System.out.println("\n\n\t\t\t\t��ӭʹ�ð��������ϵͳ\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t\t\t 1. �� �� �� Ϣ �� ��\n");
		System.out.println("\t\t\t\t 2. �� �� �� ��\n");
		System.out.println("\t\t\t\t 3. �� �� �� ��\n");		
		System.out.println("\t\t\t\t 4. ע ��\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("��ѡ��,��������:");
		
		Scanner input = new Scanner(System.in);
		boolean con = false;
		do{
			String num = input.next();
			  if(num.equals("1")){
                   //��ʾ�ͻ���Ϣ����˵�
				   showCustMMenu();
				   break;
			  }else if(num.equals("2")){
				   //��ʾ�������˵�
				   Pay pay = new Pay();
				   pay.setData(goodsName, goodsPrice, custNo, custBirth, custScore);
				   pay.calcPrice();
				   break;
			  }else if(num.equals("3")){
                   //��ʾ��������˵�
				   showSendGMenu();
				   break;
			  }else if(num.equals("4")){
				   showLoginMenu(); 
				   break;
			  }else{
				   System.out.print("��������������������֣�");
				   con = false;
			  }
		}while(!con);
	}
	
	/**
	 * �ͻ���Ϣ����˵�
	 */
	
	public void showCustMMenu() {
		System.out.println("���������ϵͳ > �ͻ���Ϣ����\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t\t\t 1. �� ʾ �� �� �� �� �� Ϣ\n");
		System.out.println("\t\t\t\t 2. �� �� �� �� �� Ϣ\n");
		System.out.println("\t\t\t\t 3. �� �� �� �� �� Ϣ\n");
		System.out.println("\t\t\t\t 4. �� ѯ �� �� �� Ϣ\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("��ѡ��,�������ֻ�'n'������һ���˵�:");
		Scanner input = new Scanner(System.in);
	    
		boolean con = true;  //�����������˵��Ŵ���
	    do{
	      CustManagement cm = new CustManagement();
		  cm.setData(goodsName, goodsPrice, custNo, custBirth, custScore);
		  String num = input.next();
		  if(num.equals("1")){
			  cm.show();
			  break;
		  }else if(num.equals("2")){
			  cm.add();
			  break;
		  }else if(num.equals("3")){
			  cm.modify();
			  break;
		  }else if(num.equals("4")){
			  cm.search();
			  break;
			 
		  }else if(num.equals("n")){
              showMainMenu();
        	  break;
		  }else{
			System.out.println("�������, �������������֣�");
			con = false;
		  }
	    }while(!con);
	}
	
	/**
	 * ��ʾ���������ϵͳ����������˵�
	 */
	public void showSendGMenu(){
		 System.out.println("���������ϵͳ > �������\n");
		 System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		 System.out.println("\t\t\t\t 1. �� �� �� �� ��\n");
		 System.out.println("\t\t\t\t 2. �� �� �� ��\n");
		 System.out.println("\t\t\t\t 3. �� �� �� ��\n");
		 System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		 System.out.print("��ѡ��,�������ֻ�'n'������һ���˵�:");
		 Scanner input = new Scanner(System.in);
		 
		 boolean con = true;  //�����������˵��Ŵ���
		 GiftManagement gm = new GiftManagement();
		 gm.setData(goodsName, goodsPrice, custNo, custBirth, custScore);
		    do{
			  String num = input.next();
			  if(num.equals("1")){
                   //���˴����
				   gm.sendGoldenCust();
				   break;
			  }else if(num.equals("2")){
                  //���˳齱
				   gm.sendLuckyCust();
				   break;
			  }else if(num.equals("3")){
                  //�����ʺ�
				  gm.sendBirthCust();
				  break;
			  }else if(num.equals("n")){
                  showMainMenu();
                  break;
			  }else{
				System.out.println("�������, �������������֣�");
				con = false;
			  }
		    }while(!con);
	}
}
