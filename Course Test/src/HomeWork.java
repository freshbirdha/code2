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
		System.out.print("要开始吗？(y/n):");
		String start = sc.next();
		
		if(start.equals("y")) {
			
			while(true) {
				count++;
				
			//用户出拳
				int guess = user();
			
			//电脑出拳
				int computerGuess = computer();
				
			//计算输赢
				calculationWin(guess,computerGuess);
					
				System.out.println();
				System.out.println("是否进行下一轮(y/n)");
				String selected = sc.next();
				if(!selected.equals("y")) {
					
					break;				
				}
				
			}//while end
			
			result();
									
		}else {
			System.out.println("游戏结束");
			
		}
		
		 		 		 			
	}//main end

	private static void init() {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t\t*****************");
		System.out.println("\t\t\t\t**  猜拳，开始    **");
		System.out.println("\t\t\t\t*****************");
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("出拳规则:1.石头 2.剪刀3.布");
		System.out.print("请选择对方角色(1:刘备 2:孙权 3:曹操):");
		String selected = sc.next();
		
		if(selected.equals("1")) {
			computerName = "刘备";
			
		}else if(selected.equals("2")) {
			computerName = "孙权";
		}else if(selected.equals("3")) {
			computerName = "曹操";
		}else {
			computerName = "外星人";
		}
		
		System.out.print("你选择了"+ computerName +"对战，请输入您的姓名:");
		username = sc.next();
		System.out.println(username +  " VS    "+  computerName  + "  对战");
		
	}

	private static void calculationWin(int guess,int computerGuess) {
		int result = guess -computerGuess;
		if(result == -1 || result ==2) {
			userScore++;
			System.out.println("结果: 恭喜你，赢了");
		}else if(result == -2 || result ==1) {
			computerScore++;
			System.out.println("结果: 啊奥，电脑赢了");
		} else {
			System.out.println("结果: 平局");
		}
		
	}

	private static int computer() {
		//电脑出拳，通过随机数实现;
		int computerGuess = r.nextInt(3) +1;  //3的话就是0，1，2；
		String computerStr = null;
		if(computerGuess == 1) {
			computerStr = "石头";
			
		}else if(computerGuess == 2) {
			computerStr = "剪刀";
		}else if(computerGuess == 3) {
			computerStr = "布";
		}
		System.out.print(computerName + "出拳:" + computerStr);
		return computerGuess;
	}

	private static int user() {
	
		System.out.println();
		System.out.print("请出拳:1.石头 2.剪刀3.布(输入相应的数字):");
		int guess = sc.nextInt();
		String guessStr = null;
		if(guess == 1) {
			guessStr = "石头";
			
		}else if(guess == 2) {
			guessStr = "剪刀";
		}else if(guess == 3) {
			guessStr = "布";
		}else {
			guessStr = "石头";
			guess = 1;
		}
		System.out.print("你出拳:" + guessStr);
		System.out.println();
		return guess;
	}

	private static void result() {
		
		System.out.println(computerName+"    VS   "+username);
		System.out.println("对战次数 :" + count);
		System.out.println();
		System.out.println("姓名\t得分");
		
		System.out.println(username+"\t" +userScore);
		System.out.println(computerName+"\t"+computerScore);
		System.out.println();
		if(userScore > computerScore) {
			System.out.println("结果:恭喜，你赢了");
			
		}else if(userScore < computerScore) {
			System.out.println("结果:很遗憾，你输了");
		}else {
			System.out.println("结果:平局");
		}
		
	}

}
