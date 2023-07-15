import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertiesFilesTEST {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pro = new Properties();
		FileInputStream inputStream = new FileInputStream("banma.properties");
		pro.load(inputStream);
		
		System.out.println(pro.getProperty("banma"));  //getKeyªÒ»°÷µ
		inputStream.close();

	}

}
