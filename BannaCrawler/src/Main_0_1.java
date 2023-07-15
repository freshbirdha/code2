
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
 * 斑马网址下载器
 * @author USER
 *
 */
public class Main_0_1 {
	static LinkedList<String> urlsLinkedList = new LinkedList<>();
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("欢迎使用斑马网站下载器");
			System.out.println();
			System.out.println("请输入您需要下载网站的域名");
			
			String domainUrl = input.nextLine();
			
			urlsLinkedList.add(domainUrl);
		}
		
	
		//1.通过url类拿到目标网站首页的html内容
	//	
		
		  //2.根据url获取页面内容，并保存(IO文件流)
	//	
		
		  //2.1.将上一步html字符串内容中的链接地址给提取出来，方便下次获取
		  
		//4.循环1-3步
        while (urlsLinkedList.size() != 0) {
        	
        	String link = urlsLinkedList.getFirst();
        	
        	String htmlString = getPageContentByUrl(link);
        	
        	saveFile(htmlString);
        	
        	urlsLinkedList.removeFirst();
        	
        	System.out.println(link + "页面抓取完毕");
		}
		  
		System.out.println("下载完毕");
		
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
