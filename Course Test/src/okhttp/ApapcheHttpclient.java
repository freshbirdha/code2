package okhttp;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ApapcheHttpclient {

	public static void main(String[] args) throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://t.weather.sojson.com/api/weather/city/101030100");
		CloseableHttpResponse response1 = httpclient.execute(httpGet);
	
		try {
		    System.out.println(response1.getStatusLine());
		    HttpEntity entity1 = response1.getEntity();
		  
		   System.out.println(EntityUtils.toString(entity1));
		    
		} finally {
		    response1.close();
		}


	}

}
