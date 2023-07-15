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
 * ������վ���������������
 * 
 * @author banma
 *
 */
public class Main {

	static LinkedList<String> urls = new LinkedList<String>();
	
	public static void main(String[] args) {
		//����һ�����Ԥ��ץȡURL�Ķ���
	
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭʹ�ð�����վ������");
		System.out.println("");
		System.out.print("����������Ҫ������վ������:");
		String domainUrl = input.nextLine();
		urls.add(domainUrl);
		//http://www.ekidata.jp
		
		
		
		while(urls.size() != 0) {
			// 1.ͨ��url���õ�Ŀ����վ����ҳ html ���� ��/index.html��
			String link = urls.getFirst();
			String htmlString = getPageContentByUrl(link);
			
			// 2.����url��ȡҳ�����ݣ������б��棨IO�ļ�����
			saveFile(htmlString);
			
				// 2.1.����һ��html�ַ��������е� ���ӵ�ַ����ȡ�����������´λ�ȡ
			
			urls.removeFirst();
			
			// 4.ѭ�� ��1 - 3 ����ֱ�����е�url�����ʻ�ȡ���
			System.out.println(link+":ҳ��ץȡ���");
		}

		// �������
		System.out.println("����ץȡ���");

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
			fileWriter.flush();//ˢ��
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ���ݴ������ַ��ȥ��ȥ����ַ��html����
	 * 
	 * @param url ��ַ 
	 * @return ����ַ������html����
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
