import java.io.File;

public class FileTest3 {

	public static void main(String[] args) {
		// 遍历指定文件夹内容
		
		//1. 声明文件路径
		File file = new File("c:\\temp");
		
		//2. 将file对象传入到printFile方法中
		printFile(file);
		
		
	}
	
	public static void printFile(File file) {
		
		if(file.exists()) {
			//如果存在 打印出path
			System.out.println(file.getPath());
			
			// 是否是一个文件夹
			if(file.isDirectory()) {
				
				//是文件夹的话 新建file对象下的子文件对象的数组
				File[] files = file.listFiles();
				
				
				//	遍历数组		
				for(File f: files) {
					
				//	拿到子文件对象再调用该方法(递归)
					printFile(f);
				}
			}
		}
	}

}
