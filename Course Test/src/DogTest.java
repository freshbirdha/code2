import model.Dog;


public class DogTest {

	public static void main(String[]args) {
		
		Dog a = new Dog();
		
		a.name = "花花公子";
		a.color = "黄色";
		a.weight = 32.5;
		
		a.show();
		System.out.println(a);
		
		
		a = new Dog();
		System.out.println(a);
		
		a.name = "黑熊";
		a.color = "黑色";
		a.weight = 23.5;
		
		a.show();
		
	}

}
