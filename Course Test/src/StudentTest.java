import model.Student;


public class StudentTest {

	public static void main(String[]args) {
		
		Student s = new Student();
		
		s.name = "Bob";
		s.age = 18;
		s.grade[0] = 100;
		s.grade[1] = 100;
		s.grade[2] = 100;
		
		s.show();
		
		System.out.println(s.getGradeAvg());
		System.out.println(s.getGradeSum());
		
	}

}
