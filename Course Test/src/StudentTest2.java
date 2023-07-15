import java.util.Scanner;

import model.Student;


public class StudentTest2 {

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生人数:");
		int n = input.nextInt();
		
		Student[] stus = new Student[n];
		
		for(int i = 0; i < stus.length; i++) {
			Student s = new Student();
			System.out.println("请输入学生姓名");
			s.name = input.next();
			System.out.println("请输入学生年龄");
			s.age = input.nextInt();
			System.out.println("请输入java成绩");
			s.grade[0] = input.nextDouble();
			System.out.println("请输入HTML成绩");
			s.grade[1] = input.nextDouble();
			System.out.println("请输入CSS成绩");
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
		System.out.println("年龄最大的为:" + age);
		
		System.out.println();
		double sum = 0;
		for(int i = 0; i < stus.length; i++) {
			Student s = stus[i];
			sum = sum + s.grade[0];
			
		}
		
		System.out.println("所有学生的Java的平均成绩是:" + (sum/n));
		
	}

}
