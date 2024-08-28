package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMTest {
	
	WebDriver driver;
	
	@BeforeTest
		public void InsilialiseBrowser( ) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterTest
	public void Teardown() {
		driver.quit();
	
	}
	@Test
	  public void LaunchApp() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
	  }
	
	@Test
	  public void EnterLoginDetails() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@type = 'submit']")).click();
		
		System.out.println(driver.getTitle());

	}
	@Test
	public void NavigateToInfo() {
		
		driver.findElement(By.xpath("//*[text()= 'My Info']")).click();
		}
	
	@Test
	public void Verifythelogo() {
		WebElement logoelement = driver.findElement(By.xpath("//div[@class = 'oxd-brand-banner']/img"));
		String imglogo = logoelement.getText();
		System.out.println("Logo Has been verified from:"+ imglogo);
	}
	

}
