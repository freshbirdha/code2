package lession08;

import java.util.Arrays;

/**
 * ��ҵ���ͣ��������
 * ��ҵ���ݣ����вο���ҵ������
 * 
 * @author banma
 */
public class Main_0_2 {

	public static void main(String[] args) {
		//�����´��벢���й۲�������˵����������ԭ��

		A a = new A();																						
		System.out.println(a.i);																						
		System.out.println(a.j);																						
		System.out.println(a.s);																						
		System.out.println(a.c);																						
		//Arrays.toString�����������������ݴ�ӡ����																						
		System.out.println(Arrays.toString(a.arr));		
	}

}

class A {																								
	public int i;																							
	public float j;																							
	public String s;																							
	public int[] arr;																							
	public char c;																								
}																								
