package TestNGPrograms;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver; 
	
	
	@BeforeClass
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void loginpage() {
		
		LoginPage lp = new LoginPage(driver);
		lp.SetUsernameDetails("Admin");
		lp.SetpasswordDetails("admin123");
		lp.clickLoginbutton();
	}
	
	@AfterClass
	
	public void driverClose() {
		driver.quit();
	}

}
