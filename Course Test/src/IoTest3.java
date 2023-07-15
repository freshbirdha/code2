import java.io.FileInputStream;


public class IoTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fInputStream = new FileInputStream("banma2.txt");
			byte[] buffer = new byte[10];  //每次截取10个
			
			int x = fInputStream.read(buffer,0,buffer.length);
			String string = new String(buffer);
			System.out.println(string);
			System.out.println(x);
			
			x = fInputStream.read(buffer,0,buffer.length);
			string = new String(buffer);
			System.out.println(string);
			System.out.println(x);
			
			fInputStream.close();
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
