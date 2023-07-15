package lesson06;

public class Operation {
	static int [][] arr;
	 //初始化人的位置
	static int p_x;
	static int p_y;
	 
	static  int box_x;
	static  int box_y;
	 
	 //目的地坐标
	static  int d_x;
	static  int d_y;
	static {
		//初始化数据
		arr = new int[10][10];
			p_x =5;
			p_y =5;
			
			box_x =2;
			box_y =2;
			
			d_x =5;
			d_y =8;
		
		 arr[p_y][p_x]=1; //数值1代表人;
		 
		 arr[box_y][box_x]=2; //数值2代表箱子;
		 
		 arr[d_y][d_x]=3; //数值3代表目的地;
		
	}
	public static boolean moveD() {
		// TODO Auto-generated method stub
		if(p_x < arr.length -1) {
			int nextX = p_x +1;
			if(arr[p_y][nextX] == 2) {//询问将要移动的目的地是否是箱子
				if(box_x == arr[p_y].length -1) {//如果箱子已经在最边界，那么跳过本次循环
					return true;
					
				}
				int boxNextX = box_x +1;  //20230424
				if(arr[p_y][boxNextX] == 3) {
												
					System.out.println("成功通关");
					return false;
					
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
		 
		return true;
	}

	public static boolean moveA() {
		// TODO Auto-generated method stub
		if(p_x >= 1) {
			int nextX = p_x -1;
			if(arr[p_y][nextX] == 2) {//询问将要移动的目的地是否是箱子
				if(box_x == 0) {//如果箱子已经在最边界，那么跳过本次循环
					return true;
					
				}
				int boxNextX = box_x -1;
				if(arr[p_y][boxNextX] == 3) {
												
					System.out.println("成功通关");
					return false;
					
				}
				box_x--;
				arr[p_y][box_x] = 2;
			}
			if(p_x >= 1) {
				arr[p_y][p_x] = 0;
				p_x--;
				arr[p_y][p_x] = 1;				
			}
			
		}
		 
		return true;
	}

	public static boolean moveS() {
		
		 if(p_y < arr.length -1) {
				int nextY = p_y +1;
				if(arr[nextY][p_x] == 2) {//询问将要移动的目的地是否是箱子
					if(box_y == arr.length -1) {//如果箱子已经在最边界，那么跳过本次循环
						//continue;
						return true;
						
					}
					int boxNextY = box_y +1;
					if(arr[boxNextY][p_x] == 3) {
													
						System.out.println("成功通关");
						return false;
						
					}
					box_y++;
					arr[box_y][p_x] = 2;
				}
				arr[p_y][p_x] = 0;
				p_y++;
				arr[p_y][p_x] = 1;				
			}
		return true;
	}

	public static boolean moveW() {
		
		 if(p_y >= 1) {
				int nextY = p_y -1;
				if(arr[nextY][p_x] == 2) {//询问将要移动的目的地是否是箱子
					if(box_y == 0) {//如果箱子已经在最边界，那么跳过本次循环
						//continue;	
						return true;
					}
					int boxNextY = box_y -1;
					if(arr[boxNextY][p_x] == 3) {//
													
						System.out.println("成功通关");
						//break;
						return false;
						
					}
					box_y--;
					arr[box_y][p_x] = 2;
				}
				arr[p_y][p_x] = 0;
				p_y--;
				arr[p_y][p_x] = 1;				
			}
		return true;
	}

	public static void printArr() {
		 //通过循环遍历数组;
		 for(int x = 0; x < arr.length; x++) {
			 for(int y = 0; y < arr[x].length; y++) {
				 if(arr[x][y] ==1) {			 
				 System.out.print("+ ");		
			 }else if(arr[x][y] == 2){//如果是箱子2，就开始描绘
				 System.out.print("■ ");
				 
			 }else if(arr[x][y] == 3){//如果是箱子3，就开始目的地描绘
				 System.out.print("● ");	 
			 } else {
				 System.out.print(arr[x][y] + " ");
				 
			 }
				 
			}
			 System.out.println();
		 		 		 			
	   }
		 
	 }

}
