import java.io.File;

public class FileTest5 {

	public static void main(String[] args) {
		//全盘搜索
		System.out.println("开始搜索.....");
		if(args != null && args.length > 0) {
			if(args.length == 1) {
				String filename = args[0];
				File[] files = File.listRoots();
				if(files != null && files.length > 0) {
					// 遍历电脑上的磁盘,比如 C, D,E;
					
					for(int i = 0; i < files.length; i++) {
						findFile(files[i], filename);
					}
					
					
				}else {
					System.out.println("请检查您的磁盘");
				}
			}
			if(args.length == 2) {
				//指定盘符搜索
				String directoryStr = args[0];  //文件夹
				String filename = args[1];
				File directory = new File(directoryStr);
				
				if(directory.exists()) {
					findFile(directory, filename);
				}else {
					System.out.println("您指定的文件夹不存在");
				}
				
				
				
			}else {
				System.out.println("程序缺少必要参数");
			}
		}else {
			System.out.println("程序缺少必要参数");
		}
	
		System.out.println("搜索完毕!");
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
					System.out.println("查找到了，在" + file.getAbsolutePath() +"有" +file.length() + "个");			
				}
			}
			
			
		}
	}
}
































