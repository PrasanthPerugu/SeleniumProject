package TestNGPrograms;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	@Test
	public void test() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Hyr Tutorials", Keys.ENTER);
		String ExpectedTittle = "Hyr Tutorials - Google Search";
		String ActualTittle = driver.getTitle();		
		Assert.assertEquals(ActualTittle , ExpectedTittle);
		//Assert.assertNotEquals(ActualTittle , ExpectedTittle);
		driver.quit();
	
	}

}
