
public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color color = Color.green;
		System.out.println(color);
		
		//values()��������ʽ�������г�Ա
		System.out.println();
		for(int i = 0; i < Color.values().length; i++) {
			Color c = Color.values()[i];
			System.out.println(c);	
		}
		
		// ordinal()�õ���Ա����λ��
			Color color2 = Color.yellow;
			System.out.println(color2.ordinal());
			
			System.out.println(color.ordinal());
			
		//ö�ٵĶԱ�
			System.out.println(color.equals(color2));
			
			System.out.println(color.ordinal() == color2.ordinal());
	}
	
	

}
