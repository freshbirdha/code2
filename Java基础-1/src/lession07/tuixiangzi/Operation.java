package lession07.tuixiangzi;

public class Operation {
	
	static int[][] arr;
	
	//人的位置
	static int p_x;
	static int p_y;
	
	//箱子的坐标
	static int box_x;
	static int box_y;
	
	//目的地的坐标
	static int d_x;
	static int d_y;
	
	static {
		//初始化数据
		
		arr = new int[10][10];
				 
		p_x = 5;
		p_y = 5;
		box_x = 2;
		
		box_y = 2;
		d_x = 8;
		d_y = 5;
		
		arr[p_y][p_x] = 1;//数值1 代表人
		arr[box_y][box_x] = 2;//数值2 代表箱子
		arr[d_y][d_x] = 3;//数值3 代表目的地
	}
	
	
	public static boolean moveD() {
		int nextX = p_x + 1;
		if(arr[p_y][nextX] == 2) {//询问将要移动到的目的地，是否是箱子
			if(box_x == arr[p_y].length - 1) {//如果箱子已经是在最边上了。那么后续的移动操作都不需要做了。因此跳过本次循环。
				return true;
			}
			box_x++;
			arr[p_y][box_x] = 2;
		}
		
		if(p_x < arr[p_y].length - 1) {
			arr[p_y][p_x] = 0;
			p_x++;
			arr[p_y][p_x] = 1;
		}
		return true;
	}

	public static boolean moveA() {
		int nextX = p_x - 1;
		if(arr[p_y][nextX] == 2) {//询问将要移动到的目的地，是否是箱子
			if(box_x == 0) {//如果箱子已经是在最边上了。那么后续的移动操作都不需要做了。因此跳过本次循环。
				return true;
			}
			box_x--;
			arr[p_y][box_x] = 2;
		}
		
		if(p_x >=1) {
			arr[p_y][p_x] = 0;
			p_x--;
			arr[p_y][p_x] = 1;
		}
		return true;
	}

	public static boolean moveS() {
		if(p_y < arr.length - 1) {
			
			int nextY = p_y + 1;
			if(arr[nextY][p_x] == 2) {//询问将要移动到的目的地，是否是箱子
				if(box_y == arr.length - 1) {//如果箱子已经是在最边上了。那么后续的移动操作都不需要做了。因此跳过本次循环。
					return true;
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
			if(arr[nextY][p_x] == 2) {//询问将要移动到的目的地，是否是箱子
				if(box_y == 0) {//如果箱子已经是在最边上了。那么后续的移动操作都不需要做了。因此跳过本次循环。
					//continue;
					return true;
				}
				int boxNextY = box_y - 1;
				if(arr[boxNextY][p_x] == 3) {//判断箱子移动后是否是目的地，
					//如果是目的地，那么给予胜利提示！
					System.out.println("成功通关！");
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
		// 通过双循环来遍历 二维数组
		for(int x = 0;x < arr.length; x++) {
			
			for(int y = 0;y < arr[x].length;y++) {
				if(arr[x][y] == 1) {
					System.out.print("+ ");
				}else if(arr[x][y] == 2){//如果是2的话，就给予箱子描绘
					System.out.print("■ ");
				}else if(arr[x][y] == 3){//如果是3的话，就给予目的地描绘 
					System.out.print("□ ");
				}else {
					System.out.print(arr[x][y] + " ");
				}
				
			}
			System.out.println();
		}
	}

}
