import java.io.FileReader;

public class IoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			char arr [] = new char[1000];
			FileReader bFileReader = new FileReader("banma.txt");//项目文件下的文件，相对路径
			int num = bFileReader.read(arr);
			String string = new String(arr,0,num);
			System.out.println("读取的字符个数为:" + num +  ",内容为:");
			System.out.println(string);
			bFileReader.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
