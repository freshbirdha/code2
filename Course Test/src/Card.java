
public class Card {
	private String type;  //成员属性为私有值
	private String value;

	public String getValue() { //返回值，不需要有参数
		return value;
	}
	public void setValue(String value) {
		//2-10以及A，J，Q，K
		if(value == null) {
			value = "A";
			
		}
		
		switch (value) {
		case "2":
		case "3":	
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
		case "A":
		case "J":
		case "Q":
		case "K":		
			break;

		default:
			value = "A";
			break;
		}
		this.value = value;
	}
	public String getType() {
		return type;       //为了在外部拿到值，
	}
	public  void setType(String type) {//提供公有方法可以在外部给私有成员变量赋值
		if(type == null) {
			type = "梅花";
		}
		
		if(type.equals("黑桃")
			||	type.equals("方块")	
			||  type.equals("红桃")	
			||  type.equals("梅花")) {
			this.type = type;  //  
			
		}else {
			this.type = "梅花";
		}						
		
	}
	
	private String calculation() { //封装方法，设为私有，外部无法调用
		return type + value;
	}
	
	
	public void show() {//通过公有方法将私有成员变量提供出来
		System.out.println(calculation());
		
		System.out.println(calculation());
		
	}

}
