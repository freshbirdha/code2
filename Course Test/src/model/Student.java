package model;

public class Student {
	public String name;
	public int  age;
	public double[] grade = new double[3];
	
	public void show() {
		System.out.println("����" + name);
		System.out.println("����" + age);
		System.out.println("��һ�ųɼ�" + grade[0]);
		System.out.println("�ڶ��ųɼ�" + grade[1]);
		System.out.println("�����ųɼ�" + grade[2]);
	}
	
	public double getGradeSum() {
		double sum = grade[0]+grade[1]+grade[2];
		return sum;
				
	}
	
	public double getGradeAvg() {
		return  (grade[0]+grade[1]+grade[2]) / 3;
		
				
	}
	
	public int add(int a,int b) {
		return  a + b;
		
				
	}
}
