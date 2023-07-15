
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Test1 {
 
    public static void main(String[] args) {
        String str1 = "<a href=\"https://www.zifangsky.cn/2015/10/hello-world/\" title=\"\" data-original-title=\"Hello World\">Hello World</a>";
        String str2 = "<a href=\"http://banzhuanboy.com/363.html\" class=\"post-feature\" \">123</a>";
        String str3 = " <a class=\"article-title\" href=\"/2015/12/17/Webstorm-Hotkeys-For-Mac/\">c</a>";
        String str4 = " <a rel=\"bookmark\" title=\"Permanent Link to  黑客组织‘SkidNP’涂改了Phantom Squad的网站首页\" href='12/hack-30127.htm'>黑</a>";
        String str5 = "<a href=\"http://www.imorlin.com/2015/12/24/1-3/\" title=\"\" data-original-title=\"2015圣诞节雪花代码[天猫+C店]\"> 2015圣诞节雪花代码[天猫+C店] <span class=\"label label-new entry-tag\">New</span> </a>";
        
        Pattern pattern = Pattern.compile("<a.*?href=[\"']?((https?://)?/?[^\"']+)[\"']?.*?>(.+)</a>");  
        Matcher matcher = pattern.matcher(str1);
        if(matcher.find()){
            String link = matcher.group(1).trim();
            String title = matcher.group(3).trim();
            if(!link.startsWith("http")){
                if(link.startsWith("/"))
                    link = "https://www.zifangsky.cn" + link;
                else 
                    link = "https://www.zifangsky.cn" + link;    
            }
            System.out.println("link: " + link);
            System.out.println("title: " + title);
        }
        
        
        
 
    }
 
}
 