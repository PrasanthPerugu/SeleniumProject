package SeleniumWebDriverPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> element = driver.findElements(By.tagName("a"));
		System.out.println(element.size());
		for(WebElement element1:element) {
			System.out.println(element1.getAttribute("href"));
			
		}
				driver.close();
		}
}
