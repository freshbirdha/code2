import java.io.File;

public class FileTest3 {

	public static void main(String[] args) {
		// ����ָ���ļ�������
		
		//1. �����ļ�·��
		File file = new File("c:\\temp");
		
		//2. ��file�����뵽printFile������
		printFile(file);
		
		
	}
	
	public static void printFile(File file) {
		
		if(file.exists()) {
			//������� ��ӡ��path
			System.out.println(file.getPath());
			
			// �Ƿ���һ���ļ���
			if(file.isDirectory()) {
				
				//���ļ��еĻ� �½�file�����µ����ļ����������
				File[] files = file.listFiles();
				
				
				//	��������		
				for(File f: files) {
					
				//	�õ����ļ������ٵ��ø÷���(�ݹ�)
					printFile(f);
				}
			}
		}
	}

}
