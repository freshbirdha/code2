import java.util.Scanner;

public class Test10 {
	//switch 语句只能对应整数In类型, char, String三种类型
	public static void main(String[] args) {
		int days = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("输入年份:");
		int year = sc.nextInt();
		System.out.print("输入月份:");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
		case 2:
			if(year%4 ==0 && year%100!=0 || year%400 == 0) {
				days = 29;
			}else {
				days = 28;
			}
			break;
			default:
				System.out.println("月份输入错误！");
				System.exit(0);
		}
		
		System.out.println("天数:" + days);
				
				 	 			
	}


}
