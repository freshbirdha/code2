import java.util.Scanner;

import model.Student;


public class StudentTest3 {

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
		
		System.out.println("��������Ҫ����ѧ��������:");
		String name = input.next();
		boolean isFound = false;
		for(int i = 0; i < stus.length; i++) {
			Student s = stus[i];
			if(name.equals(s.name)) {
				s.show();
				isFound = true;
				break;
			}
		
		}
		if(isFound) {
			System.out.println("�ҵ���");
		}else {
			System.out.println("û���ҵ�");
		}
		
	
		
	}

}
