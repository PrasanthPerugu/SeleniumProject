package SeleniumWebDriverPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicityWaitExample {

	public static void main(String[] args) throws InterruptedException{
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://adactin.com/HotelApp/index.php");
//		driver.findElement(By.id("username")).sendKeys("Venkat");
//		driver.findElement(By.id("password")).sendKeys("Venkat@123");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("login"))));
//		driver.findElement(By.id("login")).click();
//		//driver.close();
		
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://adactin.com/HotelApp/index.php");
			driver.findElement(By.id("username")).sendKeys("venkat");
			driver.findElement(By.id("password")).sendKeys("venkat@123");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("login"))));
			driver.findElement(By.id("login")).click();
			driver.close();
	}

}
