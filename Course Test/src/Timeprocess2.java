import java.text.SimpleDateFormat;
import java.util.Date;

public class Timeprocess2 {
	 public static void main(String[] args) {
		 //���ַ���ת����ʱ�����
		 Date dNow = null;
		 SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		 try {
			 dNow = ft.parse("2023-05-03 18:04:38");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
		System.out.println("ʱ��Ϊ:" + dNow);	
	}


}


		
			
			
	