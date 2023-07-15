import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class IoTest5 {

	public static void main(String[] args) {
		// 输出流
		File file = new File("banma3.txt");
		String string = "你好，东京";
			
		try {
			FileOutputStream outputStream = new FileOutputStream(file,true); 
			        //有true的话是追加文本(多次执行多次添加)，没有的话就是覆盖之前的文本,
			outputStream.write(string.getBytes());
			outputStream.close();
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
