package lession05;
/**
 * ��ҵ���ͣ��������
 * ��ҵ���ݣ����вο���ҵ������
 * 
 * @author banma
 */
public class Main_0_3 {

	public static void main(String[] args) {
		//�������ﳢ�Ե�������� add����,�ǵô��ϲ���
		
		//�������뽫����add�����Ľ������ӡ�������в鿴��
	}
	
	/**
	 *  �÷������Խ����������������мӷ����㣬�����������
	 * @param arr int��������
	 * @return ��ӽ��
	 */
	public static int add(int...arr) {
		int sum = 0;
		for(int i = 0;i < arr.length;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
