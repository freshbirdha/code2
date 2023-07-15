import java.util.*;

public class Test26 {
	 public static void main(String[] args) {
		 //ctrl +Shift +O 自动导包
		 Scanner input = new Scanner(System.in);
		 Random r = new Random();
		 int [][] arr = new int[10][10];
		 //初始化人的位置
		 int p_x = 5;
		 int p_y = 5;
		 arr[p_y][p_x]=1; //数值1代表人;
		 
		 while(true) {
			 //通过循环遍历数组;
			 for(int x = 0; x < arr.length; x++) {
				 for(int y = 0; y < arr[x].length; y++) {
					 if(arr[x][y] ==1) {			 
					 System.out.print("+ ");		
				 }else {
					 System.out.print(arr[x][y] + " ");
					 
				 }
					 
				}
				 System.out.println();
			 		 		 			
		   }
			 
			String select = input.next();
			if("w".equals(select)) {
				if(p_y >= 1) {
					arr[p_y][p_x] = 0;
					p_y--;
					arr[p_y][p_x] = 1;				
				}
				
			}else if("s".equals(select)) {
				if(p_y < arr.length -1) {
					arr[p_y][p_x] = 0;
					p_y++;
					arr[p_y][p_x] = 1;				
				}
			}else if("a".equals(select)) {
				if(p_x >= 1) {
					arr[p_y][p_x] = 0;
					p_x--;
					arr[p_y][p_x] = 1;				
				}
			}else if("d".equals(select)) {
				if(p_x < arr[p_y].length -1) {
					arr[p_y][p_x] = 0;
					p_x++;
					arr[p_y][p_x] = 1;				
				}			
			}
				 
		 } //while end
		 
	 } //main end
	 				
}
