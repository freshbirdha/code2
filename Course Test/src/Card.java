
public class Card {
	private String type;  //��Ա����Ϊ˽��ֵ
	private String value;

	public String getValue() { //����ֵ������Ҫ�в���
		return value;
	}
	public void setValue(String value) {
		//2-10�Լ�A��J��Q��K
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
		return type;       //Ϊ�����ⲿ�õ�ֵ��
	}
	public  void setType(String type) {//�ṩ���з����������ⲿ��˽�г�Ա������ֵ
		if(type == null) {
			type = "÷��";
		}
		
		if(type.equals("����")
			||	type.equals("����")	
			||  type.equals("����")	
			||  type.equals("÷��")) {
			this.type = type;  //  
			
		}else {
			this.type = "÷��";
		}						
		
	}
	
	private String calculation() { //��װ��������Ϊ˽�У��ⲿ�޷�����
		return type + value;
	}
	
	
	public void show() {//ͨ�����з�����˽�г�Ա�����ṩ����
		System.out.println(calculation());
		
		System.out.println(calculation());
		
	}

}
