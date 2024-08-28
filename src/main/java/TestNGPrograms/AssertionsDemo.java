package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {
	
	WebDriver driver;
	@Test
	
	public void test() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Hyr Tutorials", Keys.ENTER);
		String ExpectedTittle = "Log in to Facebook";
		String ActualTittle = driver.getTitle();
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ActualTittle , ExpectedTittle);
		driver.quit();
		softassert.assertAll();
}
}