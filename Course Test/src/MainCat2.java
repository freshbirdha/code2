import model.Cat;

public class MainCat2 {

	public static void main(String[]args) {
		Cat xiaomaoCat = new Cat();
		xiaomaoCat.age = 1;
		xiaomaoCat.color = "��ɫ";
		xiaomaoCat.jiao();
		
		Cat damaoCat = new Cat("��ɫ",5);
		
		damaoCat.jiao();
		
		
	}

}
