package lession10.shopping.management;

import java.util.Scanner;

import lession08.shopping.data.Data;

public class Main {
	
      /**
       * ���������ϵͳ�����
       *
       */
	  public static void main(String[] args){
    	   /*��ʼ���̳�����Ʒ�Ϳͻ���Ϣ*/
           Data initial = new Data();
           initial.ini();
           
           
           /*����ϵͳ*/
           Menu menu = new Menu();
     	   menu.setData(initial.goodsName, initial.goodsPrice, 
          		   initial.custNo, initial.custBirth,initial.custScore);
           menu.showLoginMenu();
           
           /*�˵�ѡ��*/
           boolean con = true;
           while(con){
        	   try {
        		   Scanner input = new Scanner(System.in);
                   int choice = input.nextInt();
                   VerifyEqual pv = new VerifyEqual();
                   switch(choice){
                     case 1: 
                  	  /*������֤*/
                  	  for(int i = 3; i>=1; i--){
                  		  if(pv.verify(initial.manager.username, initial.manager.password)){
                          	  menu.showMainMenu();
                          	  break;
                  		  }else if(i!=1){
                  			  System.out.println("\n�û��������벻ƥ�䣬���������룺"); //����3�����룬�˳�
                  		  }else{
                  			  System.out.println("\n��û��Ȩ�޽���ϵͳ��лл��");
                  			  con = false;
                  		  }
                  	  }
                  	  break;
                     case 2: 
                  	  if(pv.verify(initial.manager.username, initial.manager.password)){
                  		  System.out.print("�������µ��û�����");
                  		  initial.manager.username = input.next();
                  		  System.out.print("�������µ����룺");
                  		  initial.manager.password = input.next();
                  		  System.out.println("�û����������Ѹ��ģ�");
                  		  System.out.println("\n��ѡ���������֣�");
                  	  }else{
                  		  System.out.println("��Ǹ����û��Ȩ���޸ģ�");
                  		  con = false;
                  	  }
                  	  break;
                     case  3: 
                  	  System.out.println("лл����ʹ�ã�");
                  	  con = false;
                  	  break;
                     default: 
                  	  System.out.print("\n��������������ѡ����������: ");
                   }
                   if(!con){
                  	 break;
                   }
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("ϵͳ������һ�����������²���");
			}
             
           }//while end
          
      }
}
