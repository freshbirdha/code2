package lession07.caiquan;
import java.util.Scanner;
import java.util.Random;
/**
 * 《《《推箱子游戏重构0.2版本》》》
 * @author banma
 *
 */
public class Caiquan{
	
	static Scanner sc = new Scanner(System.in);
	static Random r = new Random();
	
	static String conputerName;
	static String username;
	
	static int count = 0;
	static int userScore = 0;
	static int conputerScore = 0;
	
	public static void main(String args[]){
			
			init();
			
			System.out.println();
			System.out.print("要开始吗？(y/n)：");
			String start = sc.next();
			
			if(start.equals("y")){
				
				while(true){
					count++;
					//鐢ㄦ埛鍑烘嫵浠ｇ爜
					int chuquan = user();
					
					int conputerChuquan = computer();

					calculateWin(chuquan,conputerChuquan);

					System.out.println();
					System.out.println("是否进行下一轮(y/n)");
					String selected = sc.next();
					if(!selected.equals("y")){
						break;
					}

				}//while end 

				result();

			}else{
				System.out.println("娓告垙缁撴潫");
			}

	}//main end
	
	private static void init() {

		System.out.println("\t\t\t\t*************************");
		System.out.println("\t\t\t\t**	猜拳,开始       **");
		System.out.println("\t\t\t\t*************************");
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("出拳规则:1.石头 2,剪刀 3.布");
		System.out.print("请选择对方角色(1：刘备 2：孙权 3：曹操)：");
		String selected = sc.next();
		
		if(selected.equals("1")){
			conputerName = "刘备";
		}else if(selected.equals("2")){
			conputerName = "孙权";
		}else if(selected.equals("3")){
			conputerName = "曹操";
		}else{
			conputerName = "外星人";
		}

		System.out.print("你选择了刘备对战请输入你的姓名：");
		username = sc.next();
		System.out.println(username+" VS  "+conputerName+"  对战");

		
	}

	private static void calculateWin(int chuquan,int conputerChuquan) {
		int result  = chuquan - conputerChuquan;
		if(result == -1 || result == 2){
			userScore++;
			System.out.println("结果：恭喜，您赢了。");
		}else if(result == 1 || result == -2){
			conputerScore++;
			System.out.println("结果：啊噢，电脑赢了。");
		}else{// 否则就是 0
			System.out.println("结果：平均。");
		}
		
	}

	private static int computer() {
		//电脑出拳，通过随机数实现
		int conputerChuquan = r.nextInt(3) + 1;
		String conputerChuquanStr = null;
		if(conputerChuquan == 1){
			conputerChuquanStr = "石头";
		}else if(conputerChuquan == 2){
			conputerChuquanStr = "剪刀";
		}else if(conputerChuquan == 3){
			conputerChuquanStr = "布";
		}

		System.out.println(conputerName + "出拳："+conputerChuquanStr);
		
		return conputerChuquan;

	}

	/**
	 * 鐢ㄦ埛鍑烘嫵
	 */
	private static int user() {
		System.out.println();
		System.out.print("请出拳:1.石头 2,剪刀 3.布 (输入相应的数字):");
		int chuquan = sc.nextInt();
		String chuquanStr = null;

		if(chuquan == 1){
			chuquanStr = "石头";
		}else if(chuquan == 2){
			chuquanStr = "剪刀";
		}else if(chuquan == 3){
			chuquanStr = "布";
		}else{
			chuquanStr = "石头";
			chuquan = 1;
		}

		System.out.println("你出拳："+chuquanStr);
		return chuquan;
		
	}

	private static void result() {
		System.out.println(conputerName+"    VS    "+username);
		System.out.println("对战次数："+count);
		System.out.println();
		System.out.println("姓名\t得分");
		System.out.println(username+"\t"+userScore);
		System.out.println(conputerName+"\t"+conputerScore);
		System.out.println();
		if(userScore > conputerScore){
			System.out.println("结果：牛逼啊，你赢了。在下佩服佩服！");
		}else if(userScore < conputerScore){
			System.out.println("结果：很遗憾，小样。你没能战胜："+conputerName);
		}else{
			System.out.println("结果：真是难逢敌手 打的分上下！");
		}
		
		
	}
	
	
}																								
																									
																					

																					


