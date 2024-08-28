package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver driver;
	@Test
	public void test() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		int day = 15;
		
		driver.findElement(By.id("first_date_picker")).click();
		WebElement date = driver.findElement(By.xpath("//table[@class = 'ui-datepicker-calendar']//a[text()="+day+"]"));
		date.click();
		driver.close();
	}
	
	@Test
	public void test1() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		System.out.println(driver.getTitle());
		driver.close();
	}	
}


