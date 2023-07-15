import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {
		// 获取文件夹下所有的文件对象
		File file = new File("c:\\temp");
		File[] files = file.listFiles();
		//如果temp存在的话就通过循环返回文件对象名字
		for(File f: files) {
			System.out.println(f.getName());
		}
		
	}

}
