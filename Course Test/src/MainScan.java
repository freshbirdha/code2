import java.util.Scanner;

public class MainScan {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("斑马文件管理系统");
		FileScanThread fileScanThread = new FileScanThread();
		fileScanThread.setDaemon(true);
		while (true) {
			System.out.println("1扫描磁盘文件数 2查看已扫描文件数 3退出程序" );
			String selceted = inputScanner.next();
			if("1".equals(selceted)) {
				if(fileScanThread.isAlive()) {
					System.out.println("已在扫描中,请按2查看当前扫描文件数");
					
				}else {
					fileScanThread.start();
				}
			}else if("2".equals(selceted)) {
				System.out.println("当前找到文件数:" + fileScanThread.filepathList.size());	
			}else if("3".equals(selceted)) {
				break;
			}else {
				System.out.println("输入错误");
			}
			
		}//while end
		
		System.out.println("程序结束");
		
	}

	
	

}
