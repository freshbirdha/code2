import java.io.File;

public class FileTest5 {

	public static void main(String[] args) {
		//ȫ������
		System.out.println("��ʼ����.....");
		if(args != null && args.length > 0) {
			if(args.length == 1) {
				String filename = args[0];
				File[] files = File.listRoots();
				if(files != null && files.length > 0) {
					// ���������ϵĴ���,���� C, D,E;
					
					for(int i = 0; i < files.length; i++) {
						findFile(files[i], filename);
					}
					
					
				}else {
					System.out.println("�������Ĵ���");
				}
			}
			if(args.length == 2) {
				//ָ���̷�����
				String directoryStr = args[0];  //�ļ���
				String filename = args[1];
				File directory = new File(directoryStr);
				
				if(directory.exists()) {
					findFile(directory, filename);
				}else {
					System.out.println("��ָ�����ļ��в�����");
				}
				
				
				
			}else {
				System.out.println("����ȱ�ٱ�Ҫ����");
			}
		}else {
			System.out.println("����ȱ�ٱ�Ҫ����");
		}
	
		System.out.println("�������!");
	}// main end
	
	public static void findFile(File file,String name) {
		if(file != null ) {
		//	System.out.println(file.getAbsolutePath());
			if(file.isDirectory()) {
			File[] files =file.listFiles();
				if(files != null) {
					for(int i = 0; i < files.length;i++) {
						findFile(files[i],name);
					}
				}
			
			}else {
				if(file.getName().equals(name)) {
					System.out.println("���ҵ��ˣ���" + file.getAbsolutePath() +"��" +file.length() + "��");			
				}
			}
			
			
		}
	}
}
































