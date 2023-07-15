package lession13;

import java.io.File;

/**
 * 作业类型：代码优化
 * 作业内容：另行参考作业描述！
 * 
 * @author banma
 */
public class Main_2_0 {

	public static void main(String[] args){
		//请阅读以下代码，并试图去理解，然后将指定地方写上自己的注释。
		
		System.out.println("开始搜索。。。。。");
		//请在这里注释
		if(args != null && args.length > 0) {
			if(args.length == 1) {//请在这里注释
				//请在这里注释
				String filename = args[0];
				File[] files = File.listRoots();//请在这里注释
				//请在这里注释
				if(files != null && files.length > 0) {
					//请在这里注释
					for (int i = 0; i < files.length; i++) {
						findFile(files[i],filename);//请在这里注释
					}

				}else {
					System.out.println("请检查您的磁盘！");
				}
				
			}if(args.length == 2) {//请在这里注释
				// 指定盘符搜索
				String directoryStr = args[0];
				String filename = args[1];
				File directory = new File(directoryStr);
				if(directory.exists()) {//请在这里注释
					findFile(directory,filename);//请在这里注释
				}else {
					System.out.println("您指定的文件夹不存在");
				}
				
			}else {
				System.out.println("文件索搜程序 参数错误！！");
			}
		}else {
			System.out.println("文件索搜程序 缺少必要的参数！！");
		}
		
		
		System.out.println("搜索完毕。。。。。");
	}
	
	public static void findFile(File file,String name) {
		if(file != null) {
			//请在这里注释
			if(file.isDirectory()) {//请在这里注释
				File[] files = file.listFiles();//请在这里注释
				if(files != null) {
					for (int i = 0; i < files.length; i++) {
						findFile(files[i],name);//请在这里注释
					}
				}
				
			}else {
				if(file.getName().equals(name)) {//请在这里注释
					System.out.println("查找到了 在："+file.getAbsolutePath());
				}
			}
			
		}
	}

}
