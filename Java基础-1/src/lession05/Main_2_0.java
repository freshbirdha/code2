package lession05;
/**
 * ��ҵ���ͣ������Ż�
 * ��ҵ���ݣ����вο���ҵ������
 * 
 * @author banma
 */
public class Main_2_0 {

	public static void main(String[] args) {
		//����ķ�����ʽ�Ƚ��� ���ʽ������һ��
	}
	

	/**
	 *  �÷������Խ����������������мӷ����㣬�����������
	 * @param arr int��������
	 * @return int���͵���ӽ��
	 */
	public static int add(int...arr) {
int sum = 0;
for(int i = 0;i < arr.length;i++) {
	sum = sum + arr[i];
}
return sum;
	}
	
	
/**
 *  �÷������Խ����������������мӷ����㣬�����������
 * @param arr double��������
 * @return double���͵���ӽ��
 */
public static double add(double...arr) {
	double sum = 0;
	for(int i = 0;i < arr.length;i++) {
		sum = sum + arr[i];
	}
	return sum;
}

}
