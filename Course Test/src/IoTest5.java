import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class IoTest5 {

	public static void main(String[] args) {
		// �����
		File file = new File("banma3.txt");
		String string = "��ã�����";
			
		try {
			FileOutputStream outputStream = new FileOutputStream(file,true); 
			        //��true�Ļ���׷���ı�(���ִ�ж�����)��û�еĻ����Ǹ���֮ǰ���ı�,
			outputStream.write(string.getBytes());
			outputStream.close();
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
