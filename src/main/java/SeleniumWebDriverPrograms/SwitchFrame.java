package SeleniumWebDriverPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchFrame {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("prasanth");
		
		//scroll down the page 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 500)");  
		
		Thread.sleep(2000);
		
		//frame 1
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("course"));
		Select sc = new Select(ele);
		sc.selectByValue("java");
		
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("perugu");
		
		driver.switchTo().defaultContent();		
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("Helloworld");

		driver.close();
	}

}
