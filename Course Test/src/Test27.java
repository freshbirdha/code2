import java.util.*;

public class Test27 {
	 public static void main(String[] args) {
		 //ctrl +Shift +O �Զ�����
		 Scanner input = new Scanner(System.in);
		 Random r = new Random();
		 int [][] arr = new int[10][10];
		 //��ʼ���˵�λ��
		 int p_x = 5;
		 int p_y = 5;
		 
		 int box_x = 2;
		 int box_y = 2;
		 
		 
		 arr[p_y][p_x]=1; //��ֵ1������;
		 
		 arr[box_y][box_x]=2; //��ֵ2��������;
		 
		 
		 while(true) {
			 //ͨ��ѭ����������;
			 for(int x = 0; x < arr.length; x++) {
				 for(int y = 0; y < arr[x].length; y++) {
					 if(arr[x][y] ==1) {			 
					 System.out.print("+ ");		
				 }else if(arr[x][y] == 2){//���������2���Ϳ�ʼ���
					 System.out.print("�� ");
					 
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
					if(arr[nextY][p_x] == 2) {//ѯ�ʽ�Ҫ�ƶ���Ŀ�ĵ��Ƿ�������
						if(box_y == 0) {//��������Ѿ�����߽磬��ô��������ѭ��
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
					if(arr[nextY][p_x] == 2) {//ѯ�ʽ�Ҫ�ƶ���Ŀ�ĵ��Ƿ�������
						if(box_y == arr.length -1) {//��������Ѿ�����߽磬��ô��������ѭ��
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
				if(arr[p_y][nextX] == 2) {//ѯ�ʽ�Ҫ�ƶ���Ŀ�ĵ��Ƿ�������
					if(box_x == 0) {//��������Ѿ�����߽磬��ô��������ѭ��
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
				if(arr[p_y][nextX] == 2) {//ѯ�ʽ�Ҫ�ƶ���Ŀ�ĵ��Ƿ�������
					if(box_x == arr[p_y].length -1) {//��������Ѿ�����߽磬��ô��������ѭ��
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
