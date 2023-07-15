package okhttp;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main_0_1 {
	  final OkHttpClient client = new OkHttpClient();

	  private String run(String url) throws IOException {
	    Request request = new Request.Builder()
	        .url(url)
	        .build();

	    try (Response response = client.newCall(request).execute()) {
	      return response.body().string();
	    }
	  }

	  public static void main(String[] args) throws IOException {
		  Main_0_1 example = new Main_0_1();
	      String response = example.run("http://t.weather.sojson.com/api/weather/city/101030100");
	      System.out.println(response);
	  }
	}
