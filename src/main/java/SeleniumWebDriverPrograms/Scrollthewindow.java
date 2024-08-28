package SeleniumWebDriverPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollthewindow {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		
		// assign up to which path we want to down
		WebElement element = driver.findElement(By.className("webp-support"));
		
		// scroll down up to particular path
		j.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='View more demos']")).click();
		//driver.quit();
	}

}
