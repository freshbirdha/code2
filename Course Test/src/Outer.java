
public class Outer {
	private int size = 1;
	
	public  class Inner{
		private int size = 2;
	
		public void dostuff(int size) {
			size++;
			System.out.println(this.size);  //内部类的size
			System.out.println(Outer.this.size);//外部类的size
		}
	}
	
}
