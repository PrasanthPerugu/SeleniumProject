package SeleniumWebDriverPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("prasanth perugu");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Prasanth@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/span/div"));
		String str = element.getText();
		System.out.println(str);
		driver.quit();
	}

}
