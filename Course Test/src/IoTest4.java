import java.io.FileInputStream;


public class IoTest4 {

	public static void main(String[] args) {
		// TODO ѭ����ȡ
		StringBuffer buffer = new StringBuffer();
		
		try {
			FileInputStream fin = new FileInputStream("banma2.txt");
			byte[] bytes= new byte[10];  //ÿ�ν�ȡ10��
			
			int x = -1;
			do {
				 	x = fin.read(bytes,0,bytes.length);
					buffer.append(new String(bytes));
					bytes = new byte[10];  //���֮ǰ�ģ����½�һ��
				
			} while (x !=-1);
			
			fin.close();
			System.out.println(buffer);
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
