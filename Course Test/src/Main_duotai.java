
public class Main_duotai {

	public static void main(String[] args) {
		Cat[] clist = new Cat[10];
		Dog[] dlist= new Dog[10];
		
		Animal[] an = new Animal[10];  //�ø�������
		
		
		//����ת��
		an[0] = new Dog();
		
		an[1] = new Cat();
		
		System.out.println(an[0]);
		
		System.out.println(an[1]);
		
		//����ת�� ������--> ������
		// instance of�ؼ���
	//	Dog gDog = (Dog)an[0];
		
	//	gDog.eat(new Bone());
		
		if(an[1] instanceof Dog) {
			
			Dog gDog = (Dog)an[1];	
			gDog.eat(new Bone());
			
		}else if(an[1] instanceof Cat) {
			Cat cat = (Cat)an[1];
			cat.eat(new Finsh());
		}
		
		

	}

}
