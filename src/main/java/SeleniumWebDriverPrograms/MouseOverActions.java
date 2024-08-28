package SeleniumWebDriverPrograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseOverActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Actions actions = new Actions(driver);
				
		actions.moveToElement(driver.findElement(By.xpath("// span[.='Admin']"))).click().perform();
		
		actions.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='User Management']"))).click();
		
		//actions.moveToElement(driver.findElement(By.xpath("//a[.='Locations']"))).click().perform();
		
		
//		WebElement element = driver.findElement(By.xpath("//div[@class='oxd-select-text-input']"));
//		Select sc = new Select(element);
//		sc.selectByVisibleText("India");
		
		
		
	}

}
