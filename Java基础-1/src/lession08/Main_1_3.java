package lession08;
/**
 * ��ҵ���ͣ��������
 * ��ҵ���ݣ����вο���ҵ������
 * 
 * @author banma
 */
public class Main_1_3 {

	public static void main(String[] args) {
		//�����´��벢���й۲�������˼������ִ��˳��˵�������ԭ��
		AAA a = new AAA();
	}

}

class CC {																							
	public CC() {																						
		System.out.println("CC");																					
	}																						
}																							
																							
class BB extends CC{																							
	public BB() {																						
		System.out.println("BB");																					
	}																						
}																							
																							
class AAA extends BB{																							
	public AAA() {																						
		System.out.println("AAA");																					
	}																																											
}																							
																							
