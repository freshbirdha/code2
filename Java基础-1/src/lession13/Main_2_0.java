package lession13;

import java.io.File;

/**
 * ��ҵ���ͣ������Ż�
 * ��ҵ���ݣ����вο���ҵ������
 * 
 * @author banma
 */
public class Main_2_0 {

	public static void main(String[] args){
		//���Ķ����´��룬����ͼȥ��⣬Ȼ��ָ���ط�д���Լ���ע�͡�
		
		System.out.println("��ʼ��������������");
		//��������ע��
		if(args != null && args.length > 0) {
			if(args.length == 1) {//��������ע��
				//��������ע��
				String filename = args[0];
				File[] files = File.listRoots();//��������ע��
				//��������ע��
				if(files != null && files.length > 0) {
					//��������ע��
					for (int i = 0; i < files.length; i++) {
						findFile(files[i],filename);//��������ע��
					}

				}else {
					System.out.println("�������Ĵ��̣�");
				}
				
			}if(args.length == 2) {//��������ע��
				// ָ���̷�����
				String directoryStr = args[0];
				String filename = args[1];
				File directory = new File(directoryStr);
				if(directory.exists()) {//��������ע��
					findFile(directory,filename);//��������ע��
				}else {
					System.out.println("��ָ�����ļ��в�����");
				}
				
			}else {
				System.out.println("�ļ����ѳ��� �������󣡣�");
			}
		}else {
			System.out.println("�ļ����ѳ��� ȱ�ٱ�Ҫ�Ĳ�������");
		}
		
		
		System.out.println("������ϡ���������");
	}
	
	public static void findFile(File file,String name) {
		if(file != null) {
			//��������ע��
			if(file.isDirectory()) {//��������ע��
				File[] files = file.listFiles();//��������ע��
				if(files != null) {
					for (int i = 0; i < files.length; i++) {
						findFile(files[i],name);//��������ע��
					}
				}
				
			}else {
				if(file.getName().equals(name)) {//��������ע��
					System.out.println("���ҵ��� �ڣ�"+file.getAbsolutePath());
				}
			}
			
		}
	}

}
