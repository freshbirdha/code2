
import java.io.FileWriter;
import java.io.IOException;

public class IoTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter aFileWriter = new FileWriter("banma2.txt");
			for(int i = 32; i < 126; i++) {//��ASCII�����ʽд���Զ�ת��
				aFileWriter.write(i);
			}
			aFileWriter.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("д�����");
	}

}
