package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void SetUserInput() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void SetLoginDetails() {
		
		SeleniumPage selenium = new SeleniumPage(driver);
		selenium.SetInput("Selenium");
		selenium.SetPass("Selenium123");
		selenium.SetArea("BTM Layout, Bangalore");
		selenium.button();
	}
	
	@AfterClass
	public void closeDriver() {
		driver.quit();
	}
}
