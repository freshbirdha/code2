
public enum Color {
	green("绿色"),yellow("黄色"),red("红色");
	
	public String cString; //定义成员属性
	//用public修饰会报错
	private Color(String c) {
		this.cString = c;    //在main方法中可以取出属性值
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color color = Color.green;
		System.out.println(color.cString);
		
		}

}

