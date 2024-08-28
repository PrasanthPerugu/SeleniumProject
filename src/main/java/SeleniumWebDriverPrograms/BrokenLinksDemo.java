package SeleniumWebDriverPrograms;

import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLinksDemo {

	public static void main(String[] args) throws Exception {
		
		  URL url = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		  HttpURLConnection con = (HttpURLConnection) url.openConnection(); 
		   
		  int code = con.getResponseCode(); //if code is 200, then link is not broken 
		  System.out.println(code); 
		   
		  String msg = con.getResponseMessage(); //if msg is Ok, then link is not broken 
		  System.out.println(msg); 

	}

}
