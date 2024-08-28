package SeleniumWebDriverPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException 
	{
	//open the browser
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	//To maximize the window
	driver.manage().window().maximize();
	//To delete the cookies

	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com/");
	//To enter the url
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(1000);
	//To navigate to previous page
	driver.navigate().back();
	Thread.sleep(1000);
	//To navigate to next page
	driver.navigate().forward();
	Thread.sleep(1000);
	//Refresh current web page
	driver.navigate().refresh();
	//close the Browser
	driver.close();
	
	//WebElement x2 = driver.findElement(By.partialLinkText("Forgot"));
}
}