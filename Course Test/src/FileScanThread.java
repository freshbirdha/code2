import java.io.File;
import java.util.LinkedList;
import java.util.List;


public class FileScanThread extends Thread{
	public static List<String> filepathList = new LinkedList<>();
	
	@Override
	public void run() {
		File[] files = File.listRoots();
		if(files != null) {
			for(File a : files) {
				scan(a);
			}
		}
		System.out.println("扫描完毕,一共找到" + filepathList.size() + "个文件");
		
	}

	public void scan(File file) {
		// TODO Auto-generated method stub
		File[] files = file.listFiles();
		
		if(files == null) {
			return;
		}
		for(File a : files) {
			if(a.isDirectory()) {
				scan(a);
			}else {
				filepathList.add(a.getAbsolutePath());
			}
		}
	}
	
}





























































































