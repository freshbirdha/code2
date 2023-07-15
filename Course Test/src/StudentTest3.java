import java.util.Scanner;

import model.Student;


public class StudentTest3 {

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
		
		System.out.println("请输入需要查找学生的名字:");
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
			System.out.println("找到了");
		}else {
			System.out.println("没有找到");
		}
		
	
		
	}

}
