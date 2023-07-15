import java.io.FileInputStream;


public class IoTest4 {

	public static void main(String[] args) {
		// TODO 循环读取
		StringBuffer buffer = new StringBuffer();
		
		try {
			FileInputStream fin = new FileInputStream("banma2.txt");
			byte[] bytes= new byte[10];  //每次截取10个
			
			int x = -1;
			do {
				 	x = fin.read(bytes,0,bytes.length);
					buffer.append(new String(bytes));
					bytes = new byte[10];  //清空之前的，再新建一个
				
			} while (x !=-1);
			
			fin.close();
			System.out.println(buffer);
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
