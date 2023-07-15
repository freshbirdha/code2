import java.util.Random;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.spi.DirStateFactory.Result;

public class HomeWork {
	
	static Random r = new Random();
	static Scanner sc = new Scanner(System.in);
	static String computerName;
	static String username;
	
	static int count = 0;
	static int userScore = 0;
	static int computerScore = 0;
	
	
	
	 public static void main(String[] args) {
	
		init();
			
		System.out.println();
		System.out.print("Ҫ��ʼ��(y/n):");
		String start = sc.next();
		
		if(start.equals("y")) {
			
			while(true) {
				count++;
				
			//�û���ȭ
				int guess = user();
			
			//���Գ�ȭ
				int computerGuess = computer();
				
			//������Ӯ
				calculationWin(guess,computerGuess);
					
				System.out.println();
				System.out.println("�Ƿ������һ��(y/n)");
				String selected = sc.next();
				if(!selected.equals("y")) {
					
					break;				
				}
				
			}//while end
			
			result();
									
		}else {
			System.out.println("��Ϸ����");
			
		}
		
		 		 		 			
	}//main end

	private static void init() {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t\t*****************");
		System.out.println("\t\t\t\t**  ��ȭ����ʼ    **");
		System.out.println("\t\t\t\t*****************");
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("��ȭ����:1.ʯͷ 2.����3.��");
		System.out.print("��ѡ��Է���ɫ(1:���� 2:��Ȩ 3:�ܲ�):");
		String selected = sc.next();
		
		if(selected.equals("1")) {
			computerName = "����";
			
		}else if(selected.equals("2")) {
			computerName = "��Ȩ";
		}else if(selected.equals("3")) {
			computerName = "�ܲ�";
		}else {
			computerName = "������";
		}
		
		System.out.print("��ѡ����"+ computerName +"��ս����������������:");
		username = sc.next();
		System.out.println(username +  " VS    "+  computerName  + "  ��ս");
		
	}

	private static void calculationWin(int guess,int computerGuess) {
		int result = guess -computerGuess;
		if(result == -1 || result ==2) {
			userScore++;
			System.out.println("���: ��ϲ�㣬Ӯ��");
		}else if(result == -2 || result ==1) {
			computerScore++;
			System.out.println("���: ���£�����Ӯ��");
		} else {
			System.out.println("���: ƽ��");
		}
		
	}

	private static int computer() {
		//���Գ�ȭ��ͨ�������ʵ��;
		int computerGuess = r.nextInt(3) +1;  //3�Ļ�����0��1��2��
		String computerStr = null;
		if(computerGuess == 1) {
			computerStr = "ʯͷ";
			
		}else if(computerGuess == 2) {
			computerStr = "����";
		}else if(computerGuess == 3) {
			computerStr = "��";
		}
		System.out.print(computerName + "��ȭ:" + computerStr);
		return computerGuess;
	}

	private static int user() {
	
		System.out.println();
		System.out.print("���ȭ:1.ʯͷ 2.����3.��(������Ӧ������):");
		int guess = sc.nextInt();
		String guessStr = null;
		if(guess == 1) {
			guessStr = "ʯͷ";
			
		}else if(guess == 2) {
			guessStr = "����";
		}else if(guess == 3) {
			guessStr = "��";
		}else {
			guessStr = "ʯͷ";
			guess = 1;
		}
		System.out.print("���ȭ:" + guessStr);
		System.out.println();
		return guess;
	}

	private static void result() {
		
		System.out.println(computerName+"    VS   "+username);
		System.out.println("��ս���� :" + count);
		System.out.println();
		System.out.println("����\t�÷�");
		
		System.out.println(username+"\t" +userScore);
		System.out.println(computerName+"\t"+computerScore);
		System.out.println();
		if(userScore > computerScore) {
			System.out.println("���:��ϲ����Ӯ��");
			
		}else if(userScore < computerScore) {
			System.out.println("���:���ź���������");
		}else {
			System.out.println("���:ƽ��");
		}
		
	}

}
