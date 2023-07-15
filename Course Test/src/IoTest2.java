
import java.io.FileWriter;
import java.io.IOException;

public class IoTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter aFileWriter = new FileWriter("banma2.txt");
			for(int i = 32; i < 126; i++) {//以ASCII码的形式写入自动转型
				aFileWriter.write(i);
			}
			aFileWriter.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("写入完成");
	}

}
