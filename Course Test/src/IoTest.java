import java.io.FileReader;

public class IoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			char arr [] = new char[1000];
			FileReader bFileReader = new FileReader("banma.txt");//��Ŀ�ļ��µ��ļ������·��
			int num = bFileReader.read(arr);
			String string = new String(arr,0,num);
			System.out.println("��ȡ���ַ�����Ϊ:" + num +  ",����Ϊ:");
			System.out.println(string);
			bFileReader.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
