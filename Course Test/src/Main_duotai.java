
public class Main_duotai {

	public static void main(String[] args) {
		Cat[] clist = new Cat[10];
		Dog[] dlist= new Dog[10];
		
		Animal[] an = new Animal[10];  //用父类引用
		
		
		//向上转型
		an[0] = new Dog();
		
		an[1] = new Cat();
		
		System.out.println(an[0]);
		
		System.out.println(an[1]);
		
		//向下转型 父类型--> 子类型
		// instance of关键字
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
