package SeleniumWebDriverPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropTest {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions act = new Actions(driver);
		
		WebElement dragelement = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement dropelement = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
		
		act.clickAndHold(dragelement).moveToElement(dropelement).release().perform();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
