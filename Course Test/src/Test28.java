import java.util.*;

public class Test28 {
	public static void main(String[] args) {
		//ctrl +Shift +O �Զ�����
		 Scanner input = new Scanner(System.in);
		 Random r = new Random();
		 int [][] arr = new int[10][10];
		//��ʼ���˵�λ��
		 int p_x = 5;
		 int p_y = 5;
		//����λ��
		 int box_x = 2;
		 int box_y = 2;
		 
		//Ŀ�ĵ�����
		 int d_x =5;
		 int d_y =8;
		 
		 arr[p_y][p_x]=1;  //��ֵ1������;
		 
		 arr[box_y][box_x]=2; //��ֵ2��������;
		 
		 arr[d_y][d_x]=3; //��ֵ3����Ŀ�ĵ�;
		 
		 while(true) {
			
			 for(int i = 0; i < arr.length; i++) {
				 for(int j = 0; j < arr[i].length; j++) {
					 if(arr[i][j] ==1) {			 
					 System.out.print("�� ");		
				 }else if(arr[i][j] == 2){ //���������2���Ϳ�ʼ���
					 System.out.print("�� ");
					 
				 }else if(arr[i][j] == 3){//�����3���Ϳ�ʼĿ�ĵ����
					 System.out.print("�� ");	 
				 } else {
					 System.out.print("�� ");
					 
				 }
					 
				}
				 System.out.println();
			 		 		 			
		   }
			 
			String select = input.next();
			if("w".equals(select)) {
				if(p_y >= 1) {
					int nextY = p_y -1;
					if(arr[nextY][p_x] == 2) { //ѯ�ʽ�Ҫ�ƶ���Ŀ�ĵ��Ƿ�������
						if(box_y == 0) {    //��������Ѿ�����߽磬��ô��������ѭ��
							continue;							
						}
						
						int boxNextY = box_y -1;
						if(arr[boxNextY][p_x] == 3) {
														
							System.out.println("�ɹ�ͨ��");
							break;
							
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
					if(arr[nextY][p_x] == 2) {
						if(box_y == arr.length -1) {
							continue;
							
						}
						int boxNextY = box_y +1;
						if(arr[boxNextY][p_x] == 3) {
														
							System.out.println("�ɹ�ͨ��");
							break;
							
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
				if(arr[p_y][nextX] == 2) {
					if(box_x == 0) {
						continue;
						
					}
					int boxNextX = box_x -1;
					if(arr[p_y][boxNextX] == 3) {
													
						System.out.println("�ɹ�ͨ��");
						break;
						
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
				if(arr[p_y][nextX] == 2) {
					if(box_x == arr[p_y].length -1) {
						continue;
						
					}
					int boxNextX = box_x +1;
					if(arr[p_y][boxNextX] == 3) {
													
						System.out.println("�ɹ�ͨ��");
						break;
						
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
		 
	}//main end
	 				
}















