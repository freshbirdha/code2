
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ������ַ������
 * @author USER
 *
 */
public class Main_0_1 {
	static LinkedList<String> urlsLinkedList = new LinkedList<>();
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("��ӭʹ�ð�����վ������");
			System.out.println();
			System.out.println("����������Ҫ������վ������");
			
			String domainUrl = input.nextLine();
			
			urlsLinkedList.add(domainUrl);
		}
		
	
		//1.ͨ��url���õ�Ŀ����վ��ҳ��html����
	//	
		
		  //2.����url��ȡҳ�����ݣ�������(IO�ļ���)
	//	
		
		  //2.1.����һ��html�ַ��������е����ӵ�ַ����ȡ�����������´λ�ȡ
		  
		//4.ѭ��1-3��
        while (urlsLinkedList.size() != 0) {
        	
        	String link = urlsLinkedList.getFirst();
        	
        	String htmlString = getPageContentByUrl(link);
        	
        	saveFile(htmlString);
        	
        	urlsLinkedList.removeFirst();
        	
        	System.out.println(link + "ҳ��ץȡ���");
		}
		  
		System.out.println("�������");
		
	}
	
	
	
	
	private static String getUrlByHtmlString(String html) {
		String urlString = null;
		 Pattern pattern = Pattern.compile("<a.*?href=[\"']?((https?://)?/?[^\"']+)[\"']?.*?>(.+)</a>");  
	        Matcher matcher = pattern.matcher(html);
	        if(matcher.find()){
	            String link = matcher.group(1).trim();
	           return link;
	           	            
	        }
			return urlString;
		
	}
	
	private static void saveFile(String fileString) {
		long nowTime = System.currentTimeMillis();
		try {
			FileWriter fileWriter = new FileWriter(new File(nowTime + ".html"));
			fileWriter.write(fileString);
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static String getPageContentByUrl(String url) {
		String line = "";
		try {
			//URL urltool = new URL("https://www.ekidata.jp/");
			URL urltool = new URL(url);
			URLConnection connection = urltool.openConnection();
			connection.setDoInput(true);
			InputStream inputStream = connection.getInputStream();
			BufferedReader input = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
			
		//	String line = "";
			StringBuffer buffer = new StringBuffer();
			
			while ((line = input.readLine()) != null) {
			String linkString = getUrlByHtmlString(line);
			if(linkString != null) {
				urlsLinkedList.add(linkString);
			}
				buffer.append(line);				
			}
			line = buffer.toString();
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
		
	}

}
