import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {
		// ��ȡ�ļ��������е��ļ�����
		File file = new File("c:\\temp");
		File[] files = file.listFiles();
		//���temp���ڵĻ���ͨ��ѭ�������ļ���������
		for(File f: files) {
			System.out.println(f.getName());
		}
		
	}

}
