package SeleniumWebDriverPrograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AleartsTest {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		
		Thread.sleep(2000);
	
		Alert act = driver.switchTo().alert();
		
		System.out.println(act.getText());	
		
		Thread.sleep(2000);
		
		act.sendKeys("yes");
		
		Thread.sleep(2000);
		
		//act.dismiss();
		

		//driver.quit();
	}

}
