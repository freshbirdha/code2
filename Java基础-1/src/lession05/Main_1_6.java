package lession05;
/**
 * ��ҵ���ͣ��������
 * ��ҵ���ݣ����вο���ҵ������
 * 
 * @author banma
 */
public class Main_1_6 {

	public static void main(String[] args) {
		
		double s = add(1.1,2.2,3.3);
		
		//���·����ж������ ������
		public static double add(double...arr) {
			double sum = 0;
			for(int i = 0;i < arr.length;i++) {
				sum = sum + arr[i];
			}
			return sum;
		}
	}
}
