package lession09;
/**
 * ��ҵ���ͣ��������
 * ��ҵ���ݣ����вο���ҵ������
 * 
 * @author banma
 */
public class Main_0_4 {
	
	public static void main(String[] args) {
		//���� ���������ڲ���ķ���ʵ���� ����lession09���� Main_0_1 ���ж����IUSB�ӿ�
		//��ʵ��open����/close���������ݣ�����������ɣ�
		//Ȼ��ִ�б����򣬹۲�������
		new IUSB() {

			@Override
			public void open() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}
			
		}.close();
			
	}

}

