package SeleniumWebDriverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogoChecking {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		boolean logo = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		if (logo == true) {
		System.out.println("logo is available");
		} else {
		System.out.println("logo is not available");
		
		}
		//driver.close();
		}

}
