import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFilesTEST2 {

	public static void main(String[] args) throws Exception {
		//д����޸�set
		Properties properties = new Properties();
		OutputStream outputStream = new FileOutputStream("banma.properties");
		
		properties.setProperty("Tokyo", "banma.school.com");
		
		properties.store(outputStream, "banmaFile!!!"); //�洢ע��

	}

}
