package SeleniumWebDriverPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMovetoelement {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.linkText("COURSES"));
		
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Digital Marketing Training']"));
		act.click(ele).perform();
		
		
	}

}
