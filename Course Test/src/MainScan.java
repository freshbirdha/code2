import java.util.Scanner;

public class MainScan {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("�����ļ�����ϵͳ");
		FileScanThread fileScanThread = new FileScanThread();
		fileScanThread.setDaemon(true);
		while (true) {
			System.out.println("1ɨ������ļ��� 2�鿴��ɨ���ļ��� 3�˳�����" );
			String selceted = inputScanner.next();
			if("1".equals(selceted)) {
				if(fileScanThread.isAlive()) {
					System.out.println("����ɨ����,�밴2�鿴��ǰɨ���ļ���");
					
				}else {
					fileScanThread.start();
				}
			}else if("2".equals(selceted)) {
				System.out.println("��ǰ�ҵ��ļ���:" + fileScanThread.filepathList.size());	
			}else if("3".equals(selceted)) {
				break;
			}else {
				System.out.println("�������");
			}
			
		}//while end
		
		System.out.println("�������");
		
	}

	
	

}
