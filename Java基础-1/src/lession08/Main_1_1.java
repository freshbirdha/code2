package lession08;
/**
 * ��ҵ���ͣ��������
 * ��ҵ���ݣ����вο���ҵ������
 * 
 * @author banma
 */
public class Main_1_1 {

	public static void main(String[] args) {
		//�����´��벢���й۲�������˼������ִ��˳��˵�������ԭ��
		AA a = new AA();	
	}

}

class AA {																		
																	
	public AA() {																	
		System.out.println("AA");																
	}	
	
	public B b = new B();	
}																		
																		
class B {																		
	public B() {																	
		System.out.println("B");																
	}																	
}																		
