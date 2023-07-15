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
 * 斑马网站下载器（爬虫程序）
 * 
 * @author banma
 *
 */
public class Main {

	static LinkedList<String> urls = new LinkedList<String>();
	
	public static void main(String[] args) {
		//定义一个存放预备抓取URL的队列
	
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎使用斑马网站下载器");
		System.out.println("");
		System.out.print("请输入您需要下载网站的域名:");
		String domainUrl = input.nextLine();
		urls.add(domainUrl);
		//http://www.ekidata.jp
		
		
		
		while(urls.size() != 0) {
			// 1.通过url类拿到目标网站的首页 html 内容 （/index.html）
			String link = urls.getFirst();
			String htmlString = getPageContentByUrl(link);
			
			// 2.根据url获取页面内容，并进行保存（IO文件流）
			saveFile(htmlString);
			
				// 2.1.将上一部html字符串内容中的 链接地址给提取出来，方便下次获取
			
			urls.removeFirst();
			
			// 4.循环 第1 - 3 步，直到所有的url都访问获取完毕
			System.out.println(link+":页面抓取完毕");
		}

		// 程序结束
		System.out.println("下载抓取完毕");

	}
	
	private static String getUrlByHtmlString(String html) {
		String url = null;
		Pattern pattern = Pattern.compile("<a.*?href=[\"']?((https?://)?/?[^\"']+)[\"']?.*?>(.+)</a>");  
	    Matcher matcher = pattern.matcher(html);
        if(matcher.find()){
            String link = matcher.group(1).trim();
            if(!link.startsWith("https")){
            	return link;
            }
            
        }
	        
       return url;
	}
	
	private static void saveFile(String fileString) {
		long tempTime = System.currentTimeMillis();
		try {
			FileWriter fileWriter = new FileWriter(new File(tempTime +".html"));
			fileWriter.write(fileString);
			fileWriter.flush();//刷新
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 根据传入的网址，去爬去该网址的html内容
	 * 
	 * @param url 网址 
	 * @return 该网址的所有html内容
	 */
	private static String getPageContentByUrl(String url) {
		String line = "";
		
		try {
			//URL urltool = new URL("http://www.ekidata.jp");
			URL urltool = new URL(url);
			
			URLConnection connection = urltool.openConnection();
			connection.setDoInput(true);
			InputStream inStream = connection.getInputStream();
			BufferedReader input = new BufferedReader(new InputStreamReader(inStream,"UTF-8"));

			StringBuffer buff = new StringBuffer();
			
			while ((line = input.readLine()) != null) {
				String link = getUrlByHtmlString(line);
				if(link != null) {
					urls.add(link);
				}
				buff.append(line);
			}
				
			line = buff.toString();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return line;
	}

}
