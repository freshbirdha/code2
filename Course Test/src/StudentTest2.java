import java.util.Scanner;

import model.Student;


public class StudentTest2 {

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ѧ������:");
		int n = input.nextInt();
		
		Student[] stus = new Student[n];
		
		for(int i = 0; i < stus.length; i++) {
			Student s = new Student();
			System.out.println("������ѧ������");
			s.name = input.next();
			System.out.println("������ѧ������");
			s.age = input.nextInt();
			System.out.println("������java�ɼ�");
			s.grade[0] = input.nextDouble();
			System.out.println("������HTML�ɼ�");
			s.grade[1] = input.nextDouble();
			System.out.println("������CSS�ɼ�");
			s.grade[2] = input.nextDouble();
			
			stus[i] = s;
		}
		
		//
		int maxAgeIndex = 0;
		int age = stus[0].age;
		for(int i = 0; i < stus.length; i++) {
			Student s = stus[i];
			if(s.age > age) {
				maxAgeIndex = i;
				age = s.age;
			}			
		}
		System.out.println("��������Ϊ:" + age);
		
		System.out.println();
		double sum = 0;
		for(int i = 0; i < stus.length; i++) {
			Student s = stus[i];
			sum = sum + s.grade[0];
			
		}
		
		System.out.println("����ѧ����Java��ƽ���ɼ���:" + (sum/n));
		
	}

}
