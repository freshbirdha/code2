import model.Dog;


public class DogTest {

	public static void main(String[]args) {
		
		Dog a = new Dog();
		
		a.name = "��������";
		a.color = "��ɫ";
		a.weight = 32.5;
		
		a.show();
		System.out.println(a);
		
		
		a = new Dog();
		System.out.println(a);
		
		a.name = "����";
		a.color = "��ɫ";
		a.weight = 23.5;
		
		a.show();
		
	}

}
