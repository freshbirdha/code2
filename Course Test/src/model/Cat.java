package model;

public class Cat {
	public String color; //���� �ֶα���;
	public int age;//�������static�ؼ������μ�public static int age��age����ȫ�ֱ���,�����༴Catd��
	public static int NO = 1;
	public int id;
	
	//���췽��
	//�����޲�������
	public Cat() {
		System.out.println("Cat()");
		id();
		
	}
	//�����вι���
	public Cat(String color,int age) {
		this.color = color;  //this.color �������������color,���ұߵ�color�����ⲿ��������color;
		this.age = age;
		id();
			
	}
	
	private void id() {
		id = NO;
		NO++;	
		
	}
	
	public void jiao() {
		if(age < 2) {
			System.out.println("111 �ҵ�ID:" + id);
			
		}else {
			System.out.println("222 �ҵ�ID:" + id);
		}
	}

}
