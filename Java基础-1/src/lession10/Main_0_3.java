package lession10;
/**
 * ��ҵ���ͣ��������
 * ��ҵ���ݣ����вο���ҵ������
 * 
 * @author banma
 */
public class Main_0_3 {

	public static void main(String[] args) {
		//����� Ϊʲô��η��ص�ֵ��2 ������1
		int i = test();
		System.out.println(i);
	}
	
	public static int test() {
		
		int a = 0;
		try {
			a = 1;
			if(a == 1) {
				throw new Exception();
			}
		} catch (Exception e) {
			return a; //�ڷ����� ���� return �ؼ��֣��Ὣ ���ص�ֵ����¼�������������ӵ����š�
		}finally {
			a = 2;
			if(a == 2) {
				return a;//�ڷ�����δ����ʵ�ַ��ص�ʱ�����������return �ؼ��֣��൱�ڸ���������һ����
			}
		}
		
		return a;
	}


}
