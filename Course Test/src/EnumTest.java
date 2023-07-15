
public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color color = Color.green;
		System.out.println(color);
		
		//values()以数组形式返回所有成员
		System.out.println();
		for(int i = 0; i < Color.values().length; i++) {
			Color c = Color.values()[i];
			System.out.println(c);	
		}
		
		// ordinal()拿到成员索引位置
			Color color2 = Color.yellow;
			System.out.println(color2.ordinal());
			
			System.out.println(color.ordinal());
			
		//枚举的对比
			System.out.println(color.equals(color2));
			
			System.out.println(color.ordinal() == color2.ordinal());
	}
	
	

}
