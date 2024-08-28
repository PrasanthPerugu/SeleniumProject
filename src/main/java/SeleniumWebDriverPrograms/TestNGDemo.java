package SeleniumWebDriverPrograms;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGDemo {
	
	WebDriver driver;
	
	
	@Test
	
	public void test() throws Exception {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//div[2]/div/section/span")).click();
	
	Thread.sleep(1000);
	
	List<WebElement> element = driver.findElements(By.xpath("//*[@class = 'makeFlex font12 headerIconsGap']"));
	
	for(WebElement ele : element) {
		System.out.println(ele.getText());
	}


	driver.close();

}

}
