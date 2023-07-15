import java.util.*;

public class Test27 {
	 public static void main(String[] args) {
		 //ctrl +Shift +O 自动导包
		 Scanner input = new Scanner(System.in);
		 Random r = new Random();
		 int [][] arr = new int[10][10];
		 //初始化人的位置
		 int p_x = 5;
		 int p_y = 5;
		 
		 int box_x = 2;
		 int box_y = 2;
		 
		 
		 arr[p_y][p_x]=1; //数值1代表人;
		 
		 arr[box_y][box_x]=2; //数值2代表箱子;
		 
		 
		 while(true) {
			 //通过循环遍历数组;
			 for(int x = 0; x < arr.length; x++) {
				 for(int y = 0; y < arr[x].length; y++) {
					 if(arr[x][y] ==1) {			 
					 System.out.print("+ ");		
				 }else if(arr[x][y] == 2){//如果是箱子2，就开始描绘
					 System.out.print("■ ");
					 
				 }else {
					 System.out.print(arr[x][y] + " ");
					 
				 }
					 
				}
				 System.out.println();
			 		 		 			
		   }
			 
			String select = input.next();
			if("w".equals(select)) {
				if(p_y >= 1) {
					int nextY = p_y -1;
					if(arr[nextY][p_x] == 2) {//询问将要移动的目的地是否是箱子
						if(box_y == 0) {//如果箱子已经在最边界，那么跳过本次循环
							continue;
							
						}
						box_y--;
						arr[box_y][p_x] = 2;
					}
					arr[p_y][p_x] = 0;
					p_y--;
					arr[p_y][p_x] = 1;				
				}
				
			}else if("s".equals(select)) {
				if(p_y < arr.length -1) {
					int nextY = p_y +1;
					if(arr[nextY][p_x] == 2) {//询问将要移动的目的地是否是箱子
						if(box_y == arr.length -1) {//如果箱子已经在最边界，那么跳过本次循环
							continue;
							
						}
						box_y++;
						arr[box_y][p_x] = 2;
					}
					arr[p_y][p_x] = 0;
					p_y++;
					arr[p_y][p_x] = 1;				
				}
			}else if("a".equals(select)) {
				int nextX = p_x -1;
				if(arr[p_y][nextX] == 2) {//询问将要移动的目的地是否是箱子
					if(box_x == 0) {//如果箱子已经在最边界，那么跳过本次循环
						continue;
						
					}
					box_x--;
					arr[p_y][box_x] = 2;
				}
				if(p_x >= 1) {
					arr[p_y][p_x] = 0;
					p_x--;
					arr[p_y][p_x] = 1;				
				}
			}else if("d".equals(select)) {
				int nextX = p_x +1;
				if(arr[p_y][nextX] == 2) {//询问将要移动的目的地是否是箱子
					if(box_x == arr[p_y].length -1) {//如果箱子已经在最边界，那么跳过本次循环
						continue;
						
					}
					box_x++;
					arr[p_y][box_x] = 2;
				}
				if(p_x < arr[p_y].length -1) {
					arr[p_y][p_x] = 0;
					p_x++;
					arr[p_y][p_x] = 1;				
				}			
			}
				 
		 } //while end
		 
	 } //main end
	 				
}
