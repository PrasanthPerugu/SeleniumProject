package SeleniumWebDriverPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderProgramDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		int day = 15;
		
		driver.findElement(By.id("first_date_picker")).click();
		WebElement date = driver.findElement(By.xpath("//table[@class = 'ui-datepicker-calendar']//a[text()="+day+"]"));
		date.click();
	}

}
