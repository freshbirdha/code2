package lesson06;

public class Operation {
	static int [][] arr;
	 //��ʼ���˵�λ��
	static int p_x;
	static int p_y;
	 
	static  int box_x;
	static  int box_y;
	 
	 //Ŀ�ĵ�����
	static  int d_x;
	static  int d_y;
	static {
		//��ʼ������
		arr = new int[10][10];
			p_x =5;
			p_y =5;
			
			box_x =2;
			box_y =2;
			
			d_x =5;
			d_y =8;
		
		 arr[p_y][p_x]=1; //��ֵ1������;
		 
		 arr[box_y][box_x]=2; //��ֵ2��������;
		 
		 arr[d_y][d_x]=3; //��ֵ3����Ŀ�ĵ�;
		
	}
	public static boolean moveD() {
		// TODO Auto-generated method stub
		if(p_x < arr.length -1) {
			int nextX = p_x +1;
			if(arr[p_y][nextX] == 2) {//ѯ�ʽ�Ҫ�ƶ���Ŀ�ĵ��Ƿ�������
				if(box_x == arr[p_y].length -1) {//��������Ѿ�����߽磬��ô��������ѭ��
					return true;
					
				}
				int boxNextX = box_x +1;  //20230424
				if(arr[p_y][boxNextX] == 3) {
												
					System.out.println("�ɹ�ͨ��");
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
			if(arr[p_y][nextX] == 2) {//ѯ�ʽ�Ҫ�ƶ���Ŀ�ĵ��Ƿ�������
				if(box_x == 0) {//��������Ѿ�����߽磬��ô��������ѭ��
					return true;
					
				}
				int boxNextX = box_x -1;
				if(arr[p_y][boxNextX] == 3) {
												
					System.out.println("�ɹ�ͨ��");
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
				if(arr[nextY][p_x] == 2) {//ѯ�ʽ�Ҫ�ƶ���Ŀ�ĵ��Ƿ�������
					if(box_y == arr.length -1) {//��������Ѿ�����߽磬��ô��������ѭ��
						//continue;
						return true;
						
					}
					int boxNextY = box_y +1;
					if(arr[boxNextY][p_x] == 3) {
													
						System.out.println("�ɹ�ͨ��");
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
				if(arr[nextY][p_x] == 2) {//ѯ�ʽ�Ҫ�ƶ���Ŀ�ĵ��Ƿ�������
					if(box_y == 0) {//��������Ѿ�����߽磬��ô��������ѭ��
						//continue;	
						return true;
					}
					int boxNextY = box_y -1;
					if(arr[boxNextY][p_x] == 3) {//
													
						System.out.println("�ɹ�ͨ��");
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
		 //ͨ��ѭ����������;
		 for(int x = 0; x < arr.length; x++) {
			 for(int y = 0; y < arr[x].length; y++) {
				 if(arr[x][y] ==1) {			 
				 System.out.print("+ ");		
			 }else if(arr[x][y] == 2){//���������2���Ϳ�ʼ���
				 System.out.print("�� ");
				 
			 }else if(arr[x][y] == 3){//���������3���Ϳ�ʼĿ�ĵ����
				 System.out.print("�� ");	 
			 } else {
				 System.out.print(arr[x][y] + " ");
				 
			 }
				 
			}
			 System.out.println();
		 		 		 			
	   }
		 
	 }

}
