package lession08;
/**
 * ��ҵ���ͣ��������
 * ��ҵ���ݣ����вο���ҵ������
 * 
 * @author banma
 */
public class Main_1_4 {

	public static void main(String[] args) {
		//�����´��벢���й۲�������˼������ִ��˳��˵�������ԭ��
		F a = new F();	
		System.out.println(a.num);
	}

}

class E {																							
	public E() {																						
		System.out.println("E");																					
	}																						
}																							
																							
class G {																							
	public G() {																						
		System.out.println("G");																					
	}																						
}																							
																							
class F extends E{																							
	public G b = new G();																						
	int num = 10;																						
	public F() {																						
       num = 100;																							
		System.out.println("F");																					
	}																																												
}																							

