
public enum Color {
	green("��ɫ"),yellow("��ɫ"),red("��ɫ");
	
	public String cString; //�����Ա����
	//��public���λᱨ��
	private Color(String c) {
		this.cString = c;    //��main�����п���ȡ������ֵ
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color color = Color.green;
		System.out.println(color.cString);
		
		}

}

