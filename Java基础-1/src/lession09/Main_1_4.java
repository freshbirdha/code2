package lession09;
/**
 * ��ҵ���ͣ��������
 * ��ҵ���ݣ����вο���ҵ������
 * 
 * @author banma
 */
public class Main_1_4 {
	
	public class InnerA{
		public String url = "www.banma-school.com";
	}

	public static void main(String[] args) {
		//����16�� ����ʵ���� ��Ա�ڲ��� InnerA��������ֻᱨ���������������ܳɹ�ʵ����������� url������
		InnerA a = new InnerA();
		System.out.println(a.url);
	}

}
